(defproject clojure-data "0.1.0-SNAPSHOT"
  :description "Clojure library for loading and working with data sets"
  :url "TODO"
  :license {:name "TODO: Choose a license"
            :url "http://choosealicense.com/"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha16"]
                 [com.stuartsierra/component "0.3.2"]
                 [com.taoensso/timbre "4.7.4"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [com.stuartsierra/component.repl "0.2.0"]]
                   :source-paths ["dev"]}})
