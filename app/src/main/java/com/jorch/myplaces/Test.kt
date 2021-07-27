package com.jorch.myplaces

fun main() {
    val placesRepository: PlacesRepository = PlacesList()
    for (i in 0 until placesRepository.size()){
        println(placesRepository.element(i))
    }
}