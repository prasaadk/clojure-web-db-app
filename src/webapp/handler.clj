(ns webapp.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            (webapp [db :as db]))
  (:use [ring.velocity.core :only [render]]))

(defn add-actors [])

(defroutes app-routes
  (GET "/" [] "This is the front end to the awesome webapp")
  (GET "/addActor" [] (render "add_actor_result.vm" :token "this-is-a-token" :actorId "actor-id" :errorId 90))
  (GET "/listActors" [] "This is how you list actors")
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (handler/site app-routes))
