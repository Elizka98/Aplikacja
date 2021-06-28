package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pytanie3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pytanie3)
        val button21 =findViewById<Button>(R.id.b21);
        button21.setOnClickListener {
            var pyt4: Intent = Intent(applicationContext, pytanie4::class.java)
            startActivity(pyt4)
        }
    }
}