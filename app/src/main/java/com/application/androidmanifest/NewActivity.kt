package com.application.androidmanifest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        clickLogOut()


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


    private fun goToMainActivity(){
        val intent = Intent(this,MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }

    private fun clickLogOut(){
        logout.setOnClickListener {
            goToMainActivity()
        }
    }
}