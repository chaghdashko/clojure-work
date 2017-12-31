(defn square [n] (* n n))

(defn squares-of [list] (map square list))

(defn integers-starting-at [n] (cons n (lazy-seq (integers-starting-at (inc n)))))

(defn integers [] (integers-starting-at 1))

(defn squint [n] (take 25 (squares-of (integers))))

(println (squint 25))
