package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class wynik_bmi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wynik_bmi)

        val wiadomosc: String = intent.getStringExtra("wynik")
            .toString()   //wyświetlanie wyniku BMI (rezultat), który został obliczony w aktywności MainActivity
        val odpowiedz = findViewById<TextView>(R.id.wynik2).apply {
            text = wiadomosc
        }
        val button7 = findViewById<Button>(R.id.b25);
        button7.setOnClickListener {
            val dalej: Intent = Intent(applicationContext, MainActivity7::class.java)
            startActivity(dalej)
        }
    }
}