package com.example.androidlogger

import android.app.Application
import android.content.Context
import android.content.ContextWrapper
import android.util.Log
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStreamWriter
import java.util.*

class AndroidLogger {
    fun logger(message: String, applicationContext: Application) {
        val threadId = Thread.currentThread().id
        val currentTime = Calendar.getInstance().time
        val logMessage = "Thread id: $threadId\tLog time: $currentTime\tMessage: $message\n"
        Log.d("AndroidLogger", logMessage)
        writeFile(message, applicationContext)
    }

    private fun writeFile(message: String, applicationContext: Application) {
        try {
            val contextWrapper = ContextWrapper(applicationContext)
            val directory = contextWrapper.getDir("logs", Context.MODE_PRIVATE)
            val file = File(directory, "logs.txt")

            val outputStream = FileOutputStream(file, true)
            val outputStreamWriter = OutputStreamWriter(outputStream)
            outputStreamWriter.write(message)
            outputStreamWriter.close()
            Log.e("beanbean", "Done")

        } catch (exception: IOException) {
            Log.e("beanbean", "writeFile: ${exception.toString()}")
        }
    }
}