(ns euler.solver)

(defn p1-sum-mutiples-of-3-or-5-upto
  "Sum multiples of 3 or 5 upto end"
  [end]
  (reduce
    +
    (filter
      #(or (= (mod % 3) 0) (= (mod % 5) 0))
      (range end))))
