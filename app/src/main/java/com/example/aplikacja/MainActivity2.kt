package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button3 =findViewById<Button>(R.id.b3);
        button3.setOnClickListener {
            var pyt1: Intent = Intent(applicationContext, MainActivity3::class.java)
            startActivity(pyt1)
        }
    }
}