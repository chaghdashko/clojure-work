(defn example []
  (def x 8)
  (case x 5 (println "x is 5")
        10 (println "x is 10")
        (println "x is neither 5 nor 10")))

(example)
