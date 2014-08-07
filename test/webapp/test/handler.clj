(ns webapp.test.handler
  (:require [clojure.test :refer :all]
            [webapp.handler :refer :all]
            [ring.mock.request :as mock]))

(deftest test-app
  (testing "main route"
    (let [response (app (mock/request :get "/"))]
      (is (= (:status response) 200))
      (is (= (:body response) "This is the front end to the awesome webapp"))))
  
  (testing "not-found route"
    (let [response (app (mock/request :get "/invalid"))]
      (is (= (:status response) 404)))))

  (testing "Test add actors"
    (let [response (app (mock/request :get "/addActor"))]
      (is (= (:status response) 200))
      (is (= (:body response) "This is how you add actors, pass actor parameters here, &first_name, &last_name"))))

  (testing "Test list actors"
    (let [response (app (mock/request :get "/listActors"))]
      (is (= (:status response) 200))
      (is (= (:body response) "This is how you list actors"))))
