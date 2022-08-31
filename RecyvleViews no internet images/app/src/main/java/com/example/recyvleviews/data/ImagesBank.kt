package com.example.recyvleviews.data

import com.example.recyvleviews.R
import com.example.recyvleviews.model.ImageModel

class ImagesBank {
    fun LoadImages() : List<ImageModel> {
        return listOf<ImageModel> (
            ImageModel(R.string.affirmation1, R.drawable.image1),
            ImageModel(R.string.affirmation2, R.drawable.image2),
            ImageModel(R.string.affirmation3, R.drawable.image3),
            ImageModel(R.string.affirmation4, R.drawable.image4),
            ImageModel(R.string.affirmation5, R.drawable.image5),
            ImageModel(R.string.affirmation6, R.drawable.image6),
            ImageModel(R.string.affirmation7, R.drawable.image7),
            ImageModel(R.string.affirmation8, R.drawable.image8),
            ImageModel(R.string.affirmation9 ,R.drawable.image9),
            ImageModel(R.string.affirmation10, R.drawable.image10)
        )
    }
}