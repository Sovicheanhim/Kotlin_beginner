package com.example.frame_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun changeImage(view: View){
        var img = view as ImageView
        when(img.id){
            R.id.image1 ->
            {
                image1.visibility = View.GONE
                image2.visibility = View.VISIBLE
            }
            R.id.image2 ->{
                image1.visibility = View.VISIBLE
                image2.visibility = View.GONE
            }
        }

    }
}
