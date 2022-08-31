package com.example.recyvleviews.data

import com.example.recyvleviews.R
import com.example.recyvleviews.model.ImageModel

class ImagesBank {
    fun LoadImages() : List<ImageModel> {
        return listOf<ImageModel> (
            ImageModel(R.string.affirmation1, "https://media.istockphoto.com/photos/lake-atitln-volcanoes-guatemala-central-america-picture-id1195935808?k=20&m=1195935808&s=612x612&w=0&h=EL1C_dGH6YACkFOckvhppwgptrsqvwUH19mKUCEFpyU="),
            ImageModel(R.string.affirmation2, "https://viajes.nationalgeographic.com.es/medio/2018/03/15/templo-del-gran-jaguar-tikal-guatemala_5c6cb341_1280x720.jpg"),
            ImageModel(R.string.affirmation3, "https://media.istockphoto.com/photos/cityscape-of-antigua-city-guatemala-picture-id1137146624?k=20&m=1137146624&s=612x612&w=0&h=7s6BRUkYTMg0zrmB_aBeBCbMkM86SLJDiLd8oEx_5Rk="),
            ImageModel(R.string.affirmation4, "https://media.istockphoto.com/photos/sunrise-above-antigua-picture-id1207137691?k=20&m=1207137691&s=612x612&w=0&h=Im9ON1n2uRsgu3-7R1HtV_eDVJIeh3Oan-tnTVAus2o="),

        )
    }
}