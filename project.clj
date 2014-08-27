(defproject clojure-web-db-app "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.8"]]
  :plugins [[lein-ring "0.8.11"]]
  :ring {:handler webapp.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]
                        [korma "0.3.0"]
                        [mysql/mysql-connector-java "5.1.25"]
                        [org.clojure/data.xml "0.0.7"]
			[org.clojure/data.csv "0.1.2"]
                        [ring.velocity "0.1.2"]
                        ]}})

