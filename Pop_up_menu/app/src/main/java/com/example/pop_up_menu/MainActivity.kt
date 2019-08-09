package com.example.pop_up_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btn)
        registerForContextMenu(button)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.setHeaderTitle("Choose one")
        menu?.add(0, v?.getId()!!, 0, "Upload")
        menu?.add(0, v?.getId()!!, 0, "Search")
        menu?.add(0, v?.getId()!!, 0, "Share")
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        val btn = findViewById<Button>(item.itemId)
        val popupMenu = PopupMenu(this, btn)
        val inflater = popupMenu.menuInflater
        inflater.inflate(R.menu.popup_menu, popupMenu.menu)
        popupMenu.show()
        Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_LONG).show()
        return super.onContextItemSelected(item)
    }
}
