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



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        refreshButton.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ContentFragment())
                .commitAllowingStateLoss()
        }

    }


}
