(ns clojure-data.load.proto)

(defprotocol Loader
  (records
    [this]
    [this transform]
    [this transform tokenize]
    [this transform tokenize analyze]))
