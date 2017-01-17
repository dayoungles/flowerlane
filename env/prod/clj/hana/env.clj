(ns hana.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[hana started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[hana has shut down successfully]=-"))
   :middleware identity})
