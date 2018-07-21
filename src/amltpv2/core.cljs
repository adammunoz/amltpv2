(ns amltpv2.core
  (:require [goog.dom :as dom]
            [reagent.core :as r]
            [amltpv2.domain.store.core :as store]
            [amltpv2.components.app-root :as app-root])) 

(enable-console-print!)

(r/render [app-root/app-root @store/app-state]
  (dom/getElement "app"))

(defn on-js-reload [])
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)

