package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button4 =findViewById<Button>(R.id.b4);
        button4.setOnClickListener {
            var pyt10: Intent = Intent(applicationContext, pytanie2::class.java)
            startActivity(pyt10)
        }

    }
}