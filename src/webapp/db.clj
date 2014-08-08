(ns webapp.db
  (:use korma.db
        korma.core
        korma.config))

(def db (mysql {:db "sakila"
                :user "test"
                :password "test"
                       ;; optional keys
                :host "localhost"
                :port "3306"}))

(defdb korma-db db)

(defentity actor)

(select actor)

(select actor (limit 10))

(defn
  ^{:doc "This function finds the actor from the 'actor' database whose last name is equal to the passed parameter"}
  find-actor-by-last-name [last_name]
  (:first_name (first (select actor (where {:last_name last_name}) (limit 1)))))

;(find-actor-by-last-name "GUINESS")

(defn select-values [map x]
  (vals (select-keys map x)))

(defn
  ^{:doc "This function finds n actors, extracts the required keys/values and returns a vector of maps "}
  find-top-n-actors [n]
  (vec (map (fn[x] (select-keys x [:last_name :first_name])) (select actor (limit n)))))
