(ns webapp.xmlout
  (:require [clojure.data.xml :as xml]))


(defn
  ^{:doc "This is used to create xml response for the required template"} 
  create-response [sso-token response-name]
  (xml/element :XmlResponse {}
               (xml/element :SecurityToken {}  sso-token)
               (xml/element :ResponseName {} response-name)))

(defn
  "This is used to print out an xml template"
  print-response [xml-element]
  (println (xml/emit-str xml-element)))

