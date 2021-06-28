package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

public class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 =findViewById<Button>(R.id.b1);
        button1.setOnClickListener{
            var ankieta : Intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(ankieta)
        }
        val button2 =findViewById<Button>(R.id.b2);
        button2.setOnClickListener {
            var obliczenia: Intent = Intent(applicationContext, MainActivity6::class.java)
            startActivity(obliczenia)
        }


    }
}