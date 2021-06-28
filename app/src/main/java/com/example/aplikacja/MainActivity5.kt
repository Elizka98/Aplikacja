package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val button6 =findViewById<Button>(R.id.b9);
        button6.setOnClickListener {
            var bmi: Intent = Intent(applicationContext, MainActivity6::class.java)
            startActivity(bmi)
        }
    }
}