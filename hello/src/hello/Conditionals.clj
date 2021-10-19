(ns hello.Conditionals)

(defn CondIf
  []
  (if (= 2 7)
    (println "Equals")
    (println "Not Equals"))
  )

(defn CondIfDo
  []
  (if (= 5 5)
    (do (println "True first statement")
        (println "True Second statement"))
    (do (println "False first statement")
        (println "False second statement")))
  )

(defn CondNestedIf
  []
  (println "\nCondNestedIf:")
  (if (and (= 5 5) (or (= 2 2) (not true)))
    (println true)
    (println false)
    ))

(defn CondCase
  []
  (println "\nCondCase:")
  (def pet "dog")
  (case pet
    "cat" (println "I have a cat")
    "dog" (println "I have a dog")
    "fish" (println "I have a fish")
    ))

(defn CondCond
  []
  (println "\nCondCond:")
  (def amount 5)
  (cond
    (<= amount 2) (println "Few")
    (<= amount 10) (println "Several")
    (<= amount 100) (println "Many")
    :else (println "Loads")
    ))