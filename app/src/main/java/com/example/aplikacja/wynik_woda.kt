package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class wynik_woda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wynik_woda)

        val wiadomosc: String = intent.getStringExtra("wynik").toString()   //wyświetlanie wyniku BMI (rezultat), który został obliczony w aktywności MainActivity
        val odpowiedz = findViewById<TextView>(R.id.wynik8).apply {
            text = wiadomosc
        }

        val button9 = findViewById<Button>(R.id.b27);
        button9.setOnClickListener {
            val dalej: Intent = Intent(applicationContext, MainActivity9::class.java)
            startActivity(dalej)
        }
    }
}