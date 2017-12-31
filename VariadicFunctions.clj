(defn demo [message & others]
  (str message (clojure.string/join " " others)))

(defn example []
  (demo "hello" "this" "is" "a" "new" "programming" "language"))

;;(example)
(println (example))
