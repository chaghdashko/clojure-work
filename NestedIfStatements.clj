;; this program displayes hello world
(defn example [] 
  (if (and (= 2 2) (= 3 3))
      (println "values are equal")
      (println "values are not equal")))
    
(example)
