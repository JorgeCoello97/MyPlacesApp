package com.jorch.myplaces

class PlacesList: PlacesRepository {
    val places = mutableListOf<Place>()
    init {
        addExamples()
    }
    override fun element(id: Int) = places[id]

    override fun add(place: Place) = places.add(place)

    override fun new(): Int {
        val place = Place("New Place")
        places.add(place)
        return places.size - 1
    }

    override fun delete(id: Int) = places.removeAt(id)

    override fun size() = places.size

    override fun update(id: Int, place: Place) {
        places[id] = place
    }
}