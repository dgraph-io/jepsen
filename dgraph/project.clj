(defproject jepsen.dgraph "1.0.0"
  :description "Jepsen tests for Dgraph"
  :url "https://github.io/jepsen-io/jepsen"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-localrepo "0.5.4"]]
  :repositories [[local {:url "file:localrepo"
                         :checksum :ignore}]]
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [jepsen "0.1.14-SNAPSHOT"]
                 [clj-http "3.7.0"]
                 [cheshire "5.8.0"]
                 ; Note that we specify manual versions of dgraph deps since
                 ; grpc uses version ranges
                 [io.dgraph/dgraph4j "1.7.2"]
                 [clj-wallhack "1.0.1"]
                 [io.opencensus/opencensus-api  "0.18.0"]
                 [io.opencensus/opencensus-impl "0.18.0"]
                 [io.opencensus/opencensus-exporter-trace-jaeger "0.18.0"]]
  :main jepsen.dgraph.core
  :profiles {:uberjar {:aot :all}})
