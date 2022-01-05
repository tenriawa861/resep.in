package com.resep.resepmasakan.networking

object ApiEndpoint {
    var BASEURL = "https://masak-apa-tomorisakura.vercel.app"
    var PAGE = "/api/recipes/{page}"
    var CATEGORIES = "/api/categorys/recipes"
    var LIST_CATEGORIES = "/api/categorys/recipes/{key}"
    var DETAIL_RECIPES = "/api/recipe/{key}"
    var SEARCH_RECIPES = "/api/search/?q={query}"
}