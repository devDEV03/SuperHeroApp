package com.example.superheroapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.superheroapp.R

data class Heros(
    @StringRes  val nameRes : Int,
    @StringRes  val descriptionRes : Int,
    @DrawableRes val imageId : Int
)

    val listHeros = listOf(
        Heros(
            nameRes = R.string.hero1,
            descriptionRes = R.string.description1,
            imageId = R.drawable.android_superhero1
        ),
        Heros(
            nameRes = R.string.hero2,
            descriptionRes = R.string.description2,
            imageId = R.drawable.android_superhero2
        ),
        Heros(
            nameRes = R.string.hero3,
            descriptionRes = R.string.description3,
            imageId = R.drawable.android_superhero3
        ),
        Heros(
            nameRes = R.string.hero4,
            descriptionRes = R.string.description4,
            imageId = R.drawable.android_superhero4
        ),
        Heros(
            nameRes = R.string.hero5,
            descriptionRes = R.string.description5,
            imageId = R.drawable.android_superhero5
        ),
        Heros(
            nameRes = R.string.hero6,
            descriptionRes = R.string.description6,
            imageId = R.drawable.android_superhero6
        )
    )



