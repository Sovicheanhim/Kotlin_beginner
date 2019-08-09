package com.example.e_book_reader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonClick(view: View){
        val flipper =
        val butSelected = view as Button
        var page = 1
        when(butSelected.id){
            R.id.nextButton -> {
                page++

            };
            R.id.backButton -> page--;
            R.id.pageNumber -> page = pageNumber.text.toString().toInt()
        }
    }
}
