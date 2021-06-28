package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pytanie4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pytanie4)
        val button24 =findViewById<Button>(R.id.b24);
        button24.setOnClickListener {
            var pyt5: Intent = Intent(applicationContext, MainActivity4::class.java)
            startActivity(pyt5)
        }
    }
}