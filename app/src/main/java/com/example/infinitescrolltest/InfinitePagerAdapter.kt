package com.shashankk.dragdroptest

import android.content.Context
import android.graphics.drawable.Drawable
import com.example.infinitescrolltest.R

object Content {

    val textResource = arrayOf(
        R.string.string_short1,
        R.string.string_short2,
        R.string.string_short3,
        R.string.string_medium1,
        R.string.string_medium2,
        R.string.string_medium3,
        R.string.string_long1,
        R.string.string_long2,
        R.string.string_long3
    )

    fun getRandomText(context: Context): String {
        val textItem = textResource[(Math.random() * textResource.size).toInt()]
        return context.getString(textItem)
    }

    val imageResource = arrayOf(
        R.drawable.sample1,
        R.drawable.sample2,
        R.drawable.sample3,
        R.drawable.sample4,
        R.drawable.sample5,
        R.drawable.sample6,
        R.drawable.sample7,
        R.drawable.sample8,
        R.drawable.sample9,
        R.drawable.sample10,
        R.drawable.sample11,
        R.drawable.sample12,
        R.drawable.sample13,
        R.drawable.sample14,
        R.drawable.sample15,
        R.drawable.sample16,
        R.drawable.sample17,
        R.drawable.sample18,
        R.drawable.sample19,
        R.drawable.sample20,
        R.drawable.sample21,
        R.drawable.sample22,
        R.drawable.sample23,
        R.drawable.sample24,
        R.drawable.sample25,
        R.drawable.sample26,
        R.drawable.sample27,
        R.drawable.sample28,
        R.drawable.sample29,
        R.drawable.sample30
    )

    fun getRandomImage(context: Context): Drawable? {
        val textItem = imageResource[(Math.random() * imageResource.size).toInt()]
        return context.getDrawable(textItem)
    }
}