(defproject finkdat "0.1.0-SNAPSHOT"
  :description "Project based on Think Stats."
  :url "http://github.com/TomRegan/finkdat.git"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot finkdat.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
