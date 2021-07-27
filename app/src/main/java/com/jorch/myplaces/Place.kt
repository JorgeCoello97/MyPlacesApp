package com.jorch.myplaces

data class Place(
    val name: String,
    var address: String = "",
    var position: GeoPoint = GeoPoint.NOT_POSITION,
    var typePlace: TypePlace = TypePlace.OTHERS,
    var photo: String = "",
    var phone: Int = 0,
    var url: String = "",
    var comments: String = "",
    var date: Long = System.currentTimeMillis(),
    var valoration: Float = 3.5F
)