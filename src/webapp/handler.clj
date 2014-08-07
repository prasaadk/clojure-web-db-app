(ns webapp.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            (webapp [db :as db])))

(defroutes app-routes
  (GET "/" [] "This is the front end to the awesome webapp")
  (GET "/addActor" [] "This is how you add actors, pass actor parameters here, &first_name, &last_name")
  (GET "/listActors" [] "This is how you list actors")
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
