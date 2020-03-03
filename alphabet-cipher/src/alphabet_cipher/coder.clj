(ns alphabet-cipher.coder)
(require '[clojure.string :as string])

(defn char-range [start end]
  (string/join (map char (range (int start) (inc (int end))))))

(defn find-new-ind [factor length index]
  (mod (- index (+ factor length)) length))

(defn rotate [factor alphas]
  (take (count alphas) (iterate (partial find-new-ind factor (count alphas)) 0)))

(defn encode [keyword message]
  (rotate 5 (char-range \a \z)))

(defn decode [keyword message]
  "decodeme")

(defn decipher [cipher message]
  "decypherme")
