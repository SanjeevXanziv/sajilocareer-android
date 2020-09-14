package com.application.sajilocarrier

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity : "
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count = 0
        Log.d(TAG,"onCreate")
        Log.d(TAG,count.toString())
        clickImageView()

    }

    override fun onStart() {
        Log.d(TAG,"onStart")
        count = count +1
        Log.d(TAG,count.toString())
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG,"onResume")
        count = count +1
        Log.d(TAG,count.toString())
        super.onResume()
    }

    override fun onPause() {
        count = count +1
        Log.d(TAG,count.toString())
        Log.d(TAG,"onPause")
        super.onPause()
    }

    override fun onRestart() {
        count = count +1
        Log.d(TAG,count.toString())
        Log.d(TAG,"onRestart")
        super.onRestart()
    }

    override fun onStop() {
        count = count +1
        Log.d(TAG,count.toString())
        Log.d(TAG,"onStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG,"onDestroy")
        count = count +1
        Log.d(TAG,count.toString())
        super.onDestroy()
    }

    private fun goToNewActivity(){
        val intent = Intent(this,NewActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
//        finish()
    }

    private fun clickImageView(){
        imageView.setOnClickListener {
            goToNewActivity()
        }
    }
}