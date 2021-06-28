package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pytanie2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pytanie2)
        val button19 =findViewById<Button>(R.id.b19);
        button19.setOnClickListener {
            var pyt3: Intent = Intent(applicationContext, pytanie3::class.java)
            startActivity(pyt3)
        }
    }

}