(ns hana.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [hana.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[hana started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[hana has shut down successfully]=-"))
   :middleware wrap-dev})
