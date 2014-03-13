(ns gen-java-src.main
  (:require [simple-check.core :as sc]
            [simple-check.generators :as gen]
            [simple-check.properties :as prop]
            [gen-java-src.generators :as jgen])
  (:require-macros [simple-check.properties :as prop]))

(def sort-idempotent-prop
  (prop/for-all [v (gen/vector gen/int)]
    (= (sort v) (sort (sort v)))))

(enable-console-print!)
(prn (gen/sample jgen/method-name))
(prn (gen/sample jgen/class-name))
(prn (gen/sample jgen/class-gen))
