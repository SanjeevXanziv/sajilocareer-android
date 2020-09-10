package com.application.androidmanifest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        if (id == R.id.setting){
           /*val myToast =  Toast.makeText(this, "This is Setting",Toast.LENGTH_SHORT)
            myToast.show()*/
            Toast.makeText(this, "This is Setting",Toast.LENGTH_SHORT).show()

        }




        return super.onOptionsItemSelected(item)
    }
}