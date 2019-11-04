package com.example.hell_androidworld_mitchellhoward
/* This is a Kotlin script describing activity within this application
 * More specifically, this script contains a single function which
 * sets content to be displayed when the application is first started.
 * In this case, the content being shown is the layout described in
 * activity_main.xml.
 */
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
