package trpl.example.nim234311034.woofapps

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Dogdata(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val hobbies: Int
)

val dogs = listOf(
    Dogdata(R.drawable.hewan1, R.string.dog_name_1, 4, R.string.des1),
    Dogdata(R.drawable.hewan2, R.string.dog_name_2, 8, R.string.des2),
    Dogdata(R.drawable.hewan3, R.string.dog_name_3, 2, R.string.des3),
    Dogdata(R.drawable.hewan4, R.string.dog_name_4, 2, R.string.des4),

    )