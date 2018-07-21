(ns amltpv2.domain.store.core)

;; define your app data so that it doesn't get over-written on reload

(def app-settings {:version "0.0.1"})

(defonce app-state (atom {:app-settings app-settings}))

