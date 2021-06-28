package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class wynik_bmr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wynik_bmr)
        val wiadomosc: String = intent.getStringExtra("wynik1").toString()   //wyświetlanie wyniku BMI (rezultat), który został obliczony w aktywności MainActivity
        val odpowiedz = findViewById<TextView>(R.id.wynik7).apply {
            text = wiadomosc
        }

        val button8 = findViewById<Button>(R.id.b26);
        button8.setOnClickListener {
            val dalej: Intent = Intent(applicationContext, MainActivity8::class.java)
            startActivity(dalej)
        }
    }
}