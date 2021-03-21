package com.example.androidlogger

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        permission()
    }

    private fun permission() {
        ActivityCompat.requestPermissions(this@MainActivity,
            arrayOf(android.Manifest.permission.WRITE_EXTERNAL_STORAGE,
                android.Manifest.permission.READ_EXTERNAL_STORAGE), 1)
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        when (requestCode) {
            1 -> {
                if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    AndroidLogger().logger("Hello", application)

                    val t1 = Thread(
                        Runnable {
                            AndroidLogger().logger("World", application)
                        }
                    )
                    t1.start()
                } else {
                    Toast.makeText(this@MainActivity, "No permission granted", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}