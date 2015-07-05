(defproject clj-bootstrap "0.1.0-SNAPSHOT"
  :description "Clojure Bootstrap"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.4"]
                 [ring-mock "0.1.5"]
                 [ring/ring-jetty-adapter "1.3.2"]
                 [environ "1.0.0"]]
  :min-lein-version "2.0.0"
  :plugins [[environ/environ.lein "0.2.1"]]
  :hooks [environ.leiningen.hooks]
  :uberjar-name "clj-bootstrap-standalone.jar"
  :profiles {:production {:env {:production true}}
             :uberjar {:main clj-bootstrap.web, :aot :all}})
