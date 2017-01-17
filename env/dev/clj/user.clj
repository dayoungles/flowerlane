(ns user
  (:require [mount.core :as mount]
            hana.core))

(defn start []
  (mount/start-without #'hana.core/http-server
                       #'hana.core/repl-server))

(defn stop []
  (mount/stop-except #'hana.core/http-server
                     #'hana.core/repl-server))

(defn restart []
  (stop)
  (start))


