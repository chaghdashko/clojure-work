(defn example []
  (def x 10)
  (cond
    (= x 5) (println "x is 5")
    (= x 10) (println "x is 10")
    :else (println "x is neither 5 nor 10")))
(example)
