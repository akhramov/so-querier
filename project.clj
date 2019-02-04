(defproject stackoverflow-stats "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [clj-http "3.9.1"]
                 [cheshire "5.8.1"]
                 [org.clojure/core.async "0.4.490"]
                 [ring "1.7.1"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.3.2"]]
  :main ^:skip-aot stackoverflow-stats.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
