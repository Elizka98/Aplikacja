package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val button5 =findViewById<Button>(R.id.b8);
        button5.setOnClickListener {
            var koniec: Intent = Intent(applicationContext, MainActivity5::class.java)
            startActivity(koniec)
        }
    }
}