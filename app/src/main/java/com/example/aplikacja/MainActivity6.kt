package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val button6 = findViewById<Button>(R.id.b11);
        button6.setOnClickListener {
            val wyjscie1: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(wyjscie1)
        }

    }


        fun bmi(view: View) {

            val input = findViewById<EditText>(R.id.waga8)
            val input2 = findViewById<EditText>(R.id.wzrost5)
            val userInput =
                input.text.toString().toDouble()  //zczytanie z pola "waga" wartości wagi
            val userInput2 = input2.text.toString().toDouble() //zczytanie z pola "wzrost" wartości wzrostu
            val wynik = b(userInput, userInput2)  //odwołanie się do funkcji oblicz w celu wyliczenia BMI na podstawie wprowadzonych przez użytkownika danych
            val rezultat = String.format("%.2f", wynik)  //zaokrąglenie wyniku do dwóch miejsc po przecinku

            val intent = Intent(this, wynik_bmi::class.java).  //uruchomienie drugiej aktywności, w które będzie wyświetlany rezultat - wynik BMI

            apply {
                putExtra("wynik", rezultat)
            }

            startActivity(intent)
        }


        fun b(x: Double, y: Double): Double {  //funkcja służąca do obliczenia ilorazu wagi i kwadratu wzrostu
            return x / (y * y)

        }

}