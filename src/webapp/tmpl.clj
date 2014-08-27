(ns webapp.tmpl
  (:require [clojure.java.io :as io])
  (:use [ring.velocity.core :only [render]]))

(render "add_actor_result.vm" :token "this-is-a-token" :actorId "actor-id" :success true :errorId 90)
