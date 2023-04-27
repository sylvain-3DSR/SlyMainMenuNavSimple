package com.sr.slymainmenunavsimple.navigation

sealed class Destination(val route: String) {
    object MainPage: Destination(route = "main_page")
    object Page1: Destination(route = "page_1")
    object Page2: Destination(route = "page_2")
    object Page2Home: Destination(route = "page_2_home")
    object Page2Profile: Destination(route = "page_2_profile")
    object Page2Search: Destination(route = "page_2_search")
    object Page3: Destination(route = "page_3")
}
