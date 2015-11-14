(ns euler.tests-1
  (:require [clojure.test :refer :all]
            [euler.solver :refer :all]))

(deftest expected-number-is-233168
  (testing "Expected sum of all the multiples of 3 or 5 below 1000 is 233168"
    (is (= (p1-sum-mutiples-of-3-or-5-upto 1000) 233168))))
