(ns euler.solver)

(defn p1-sum-mutiples-of-3-and-5-upto
  "I don't do a whole lot."
  [end]
  (reduce
    +
    (filter
      #(or (= (mod % 3) 0) (= (mod % 5) 0))
      (range end))))
