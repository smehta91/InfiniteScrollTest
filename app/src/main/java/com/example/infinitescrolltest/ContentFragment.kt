package com.example.infinitescrolltest

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.shashankk.dragdroptest.Content

class ContentFragment: Fragment() {
    val ELEMENT_COUNT = 100
    private fun createArticles(view : View) {
        val ll = view.findViewById<ViewGroup>(R.id.linearLayout)
        ll.removeAllViews()
        for (i in 1..ELEMENT_COUNT) {
            ll.addView(Content.getRandomView(ll))

        }
    }
    var startTime = 0L
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        startTime = System.nanoTime()
        val view = inflater.inflate(R.layout.content_fragment, container, false)
        createArticles(view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val endTime = System.nanoTime()
        Toast.makeText(context, "Screen rendering took ${(endTime - startTime) / 1000000} ms", Toast.LENGTH_LONG).show()
        super.onViewCreated(view, savedInstanceState)
    }
}
