(ns hello.Functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is Ralph")
  (println "Clojure practice")
  (+ 2 5))

#(println "Hello" %)

(def increment (fn [x] (+ x 1)))

(defn incrementSet
  [x]
  (map increment x))