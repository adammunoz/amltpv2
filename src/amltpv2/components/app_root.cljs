(ns amltpv2.components.app-root
  (:require [amltpv2.components.header :as header]))

(def style {:height "100%"})

(defn app-root [state]
  [:div {:style style}
   [header/header (str "v" (-> state :app-settings :version))]]) 

