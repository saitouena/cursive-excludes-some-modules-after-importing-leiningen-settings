(ns module-a.core
  (:require [module-b.core :as mb]))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(comment
 (mb/foo 1))