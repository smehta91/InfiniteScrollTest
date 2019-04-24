package com.example.infinitescrolltest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.shashankk.dragdroptest.Content
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private fun getViewElement(): View {
        val imageOrText = (1..2).shuffled().first()
        if (imageOrText == 1) {
            val textView = TextView(this)
            val layoutParams =
                LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            layoutParams.bottomMargin = resources.getDimensionPixelOffset(
                R.dimen.marginBottom
            )
            textView.layoutParams = layoutParams
            textView.gravity = Gravity.CENTER
            textView.text = Content.getRandomText(this)
            return textView
        } else {
            val imageview = ImageView(this)
            val layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                resources.getDimensionPixelOffset(R.dimen.imageHeight)
            )
            layoutParams.bottomMargin = resources.getDimensionPixelOffset(
                R.dimen.marginBottom
            )
            imageview.layoutParams = layoutParams
            imageview.scaleType = ImageView.ScaleType.CENTER_CROP

            Glide.with(imageview)
                .load(Content.getRandomImage(this))
                .into(imageview)
            return imageview
        }
    }

    var startTime: Long = 0L
    var endTime: Long = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        startTime = System.nanoTime()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val ELEMENT_COUNT = 100
        for (i in 1..ELEMENT_COUNT) {
            linearLayout.addView(getViewElement())
        }
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        endTime = System.nanoTime()
        Toast.makeText(this, "Screen rendering took ${(endTime - startTime) / 1000000} ms", Toast.LENGTH_LONG).show()
        super.onPostCreate(savedInstanceState)

    }

    override fun onResume() {
//        endTime = System.nanoTime()
//        Toast.makeText(this, "Screen rendering took ${(endTime - startTime) / 1000000} ms", Toast.LENGTH_LONG).show()
        super.onResume()
    }
}
