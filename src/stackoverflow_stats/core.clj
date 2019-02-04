(ns stackoverflow-stats.core
  (:require
   [ring.adapter.jetty :refer [run-jetty]]
   [ring.middleware.defaults :refer :all]
   [ring.middleware.json :refer [wrap-json-response]]
   [ring.util.response :refer [response not-found]]
   [stackoverflow-stats.stackoverflow-api :as stackoverflow])
  (:gen-class))

(defn handler
  [{:keys [uri] {:keys [tag]} :params}]
  (case uri
    "/search" (response (stackoverflow/get-tagged-questions tag))
    (not-found)))

(def ^:private app
  (-> handler
      (wrap-json-response {:pretty true})
      (wrap-defaults (assoc api-defaults :nested true))))

(defn -main
  [& args]
  (run-jetty app {:port 3000}))
