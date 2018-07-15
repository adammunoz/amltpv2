(ns amltpv2.core
  (:require [goog.dom :as dom]
            [reagent.core :as r]
            [amltpv2.components.app-root :as app-root])) 

(enable-console-print!)

;; define your app data so that it doesn't get over-written on reload

(defonce app-state (atom {:text "Hello world!"}))

(r/render [app-root/app-root]
  (dom/getElement "app"))

(defn on-js-reload [])
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)

