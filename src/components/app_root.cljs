(ns amltpv2.components.app-root
  (:require [amltpv2.components.header :as header])

(def style {:height "100%"})

(defn app-root []
  [:div {:class "mui-container-fluid" 
         :style style} 
        "test"]) 

