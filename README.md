# android-logger
This is my very first library.

This library support to log message. The message includes thread ID, current time and message content. This also write to file in data/data/{{package_name}}/app_logs/logs.txt

To use this library, you have to add maven { url 'https://jitpack.io' } in your root build.gradle. After that, you have to import 
implementation 'com.github.hoangphat258:android-logger:v0.0.3'

TO MAKE THIS LIBRARY WORK PROPERLY, please request permission "android.permission.READ_EXTERNAL_STORAGE" and "android.permission.WRITE_EXTERNAL_STORAGE" in AndroidManifest.xml
