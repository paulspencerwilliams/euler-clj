(ns euler.tests-2
  (:require [clojure.test :refer :all]
            [euler.solver :refer :all]))

(deftest expected-number-is-4613732
  (testing "Expected sum of even terms in fibonacci sequence less than
   4,000,000 is 4613732"
    (is (= (p2-sum-even-fib-terms-upto 4000000) 4613732))))
