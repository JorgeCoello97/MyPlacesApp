package com.jorch.myplaces

interface PlacesRepository {
    fun element(id: Int): Place
    fun add(place: Place): Boolean
    fun new(): Int
    fun delete(id: Int): Place
    fun size(): Int
    fun update(id: Int, place: Place)

    fun addExamples(){
        add(
            Place(
                name = "Escuela Politécnica Superior de Gandía",
                address = "C/ Paranimf, 1 46730 Gandia (SPAIN)",
                position = GeoPoint(-0.166093, 38.995656),
                typePlace = TypePlace.EDUCATION,
                phone = 962849300, url = "http://www.epsg.upv.es",
                comments = "Uno de los mejores lugares para formarse.", valoration = 3f)
        )

        add(
            Place(
                name = "Al de siempre",
                address = "P.Industrial Junto Molí Nou - 46722, Benifla (Valencia)",
                position = GeoPoint(-0.190642, 38.925857),
                typePlace = TypePlace.PUB, phone = 636472405,
                comments = "No te pierdas el arroz en calabaza.", valoration = 3f)
        )

        add(
            Place(
                name = "android.curso.com",
                address = "ciberespacio",
                position = GeoPoint(0.0,0.0),
                typePlace = TypePlace.EDUCATION, phone = 962849300,
                url = "http://androidcurso.com",
                comments = "Amplia tus conocimientos sobre Android.", valoration = 5f)
        )

        add(
            Place(
                name = "Barranco del Infierno",
                address = "Vía Verde del río Serpis. Villalonga (Valencia)",
                position = GeoPoint(-0.295058,38.867180),
                typePlace = TypePlace.NATURE,
                url = "http://sosegaos.nlogspot.com.es/2009/02/lorcha-villalonga-via-verde-del-rio.html",
                comments = "Espectacular ruta para bici o andar", valoration = 4f)
        )

        add(
            Place(
                name = "La Vital",
                address = "Avda. de la Vital, 0 46701 Gandía (Valencia)",
                position = GeoPoint(-0.1720092,38.9705949),
                typePlace = TypePlace.SHOPPING, phone = 962881070,
                url = "http://www.lavital.es/",
                comments = "El típico centro comercial", valoration = 2f)
        )
    }
}