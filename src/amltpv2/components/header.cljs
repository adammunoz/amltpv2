(ns amltpv2.components.header)

(defn header [version]
  [:div {:class "mui-appbar"}
   [:div {:class "mui-row"}
    [:div {:class "mui-col-md-1"} version]]])

