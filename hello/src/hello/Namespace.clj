(ns hello.Namespace
  (:require [clojure.string :refer :all] ))

(defn -main
  []
  (println (capitalize "hello"))
  )
(-main)