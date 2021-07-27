package com.jorch.myplaces

import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt

data class GeoPoint(var longitude: Double, var latitude: Double){
    companion object {
        val NOT_POSITION = GeoPoint(0.00, 0.00)
    }
    fun distance(point: GeoPoint) : Double {
        val RADIUS_EARTH = 6371000.0 //on meters
        val dLat = Math.toRadians(latitude - point.latitude)
        val dLon = Math.toRadians(longitude - point.longitude)
        val lat1 = Math.toRadians(point.latitude)
        val lat2 = Math.toRadians(latitude)
        val a = sin(dLat / 2) * sin(dLat / 2) +
                sin(dLon / 2) * sin(dLon / 2) *
                cos(lat1) * cos(lat2)
        val c = 2 * atan2(sqrt(a), sqrt(1 - a))

        return c * RADIUS_EARTH
    }
}