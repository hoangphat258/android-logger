package com.example.androidlogger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Log.e("bean", "onCreate: ${Thread.currentThread().id}")
//
//        val t1 = Thread(
//                Runnable {
//                    Log.e("bean", "run: ${Thread.currentThread().id}")
//                }
//        )
//        t1.start()

    }
}