package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val button8 =findViewById<Button>(R.id.b);
        button8.setOnClickListener {
            var wyjscie3: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(wyjscie3)
        }
    }

    fun woda(view: View) {

        val input = findViewById<EditText>(R.id.editTextNumber4)
        val userInput = input.text.toString().toInt()  //zczytanie z pola "waga" wartości wagi
        val wynik = w(userInput)  //odwołanie się do funkcji oblicz w celu wyliczenia BMI na podstawie wprowadzonych przez użytkownika danych
        val rezultat = String.format("%.2f", wynik)
        val intent = Intent(this, wynik_woda::class.java).  //uruchomienie drugiej aktywności, w które będzie wyświetlany rezultat - wynik BMI

        apply {
            putExtra("wynik", rezultat)
        }

        startActivity(intent)
    }


    fun w(x: Int): Double{  //funkcja służąca do obliczenia ilorazu wagi i kwadratu wzrostu

        return (x*35.00)

    }

}