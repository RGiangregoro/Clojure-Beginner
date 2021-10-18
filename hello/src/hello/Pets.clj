(ns hello.Pets)

(defn petAge
  "Returns the age of the Pet"
  [petType petAge]
  (println "Pet age is " ( * (get { 'dog 7, 'cat 5, 'fish 10} petType) petAge)))