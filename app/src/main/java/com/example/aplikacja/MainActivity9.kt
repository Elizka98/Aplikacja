package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity9 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main9)

        val button9 =findViewById<Button>(R.id.b14);
        button9.setOnClickListener {
            var wyjscie4: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(wyjscie4)
        }
    }
}