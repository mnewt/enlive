(defproject enlive "1.2.0"
  :min-lein-version "2.0.0"
  :description "a HTML selector-based (à la CSS) templating and transformation system for Clojure"
  :url "http://github.com/cgrand/enlive/"
  :profiles     {:dev {:resource-paths ["test/resources"]}}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.ccil.cowan.tagsoup/tagsoup "1.2.1"]
                 [org.jsoup/jsoup "1.11.3"]])
