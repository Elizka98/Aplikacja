package com.example.aplikacja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity7 : AppCompatActivity() {
    internal lateinit var sp: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        sp = findViewById(R.id.spinner) as Spinner
        val aktywnosc = arrayOf("Znikoma ( brak ćwiczeń, praca siedząca)", "Bardzo mała (ćwiczenia raz na tydzień, praca lekka)","Umiarkowana (ćwiczenia 2 razy w tyogdniu - średniej intensywności)", "Duża (dość ciężki trening kilka razy w tygodniu)", "Bardzo duża ( przynajmniej 4 ciężki treningi w tygodniu, praca fizyczna)")
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, aktywnosc)
        sp.adapter = adapter

        sp = findViewById(R.id.spinner2) as Spinner
        val osiagniecia = arrayOf("Chcę schudnąć", "Chcę utrzymać wagę","Chcę przytyć")
        val adap = ArrayAdapter(this,android.R.layout.simple_list_item_1, osiagniecia)
        sp.adapter = adap

        val button7 =findViewById<Button>(R.id.b15);
        button7.setOnClickListener {
            var wyjscie2: Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(wyjscie2)
        }
    }
    fun bmr(view: View) {

        val input = findViewById<EditText>(R.id.editTextNumber11) //waga
        val input2 = findViewById<EditText>(R.id.editTextNumber10) //wzrost
        val input3 = findViewById<EditText>(R.id.editTextNumber9) // wiek
        val userInput = input.text.toString().toInt()  //zczytanie z pola "waga" wartości wagi
        val userInput2 = input2.text.toString().toInt() //zczytanie z pola "wzrost" wartości wzrostu
        val userInput3 = input3.text.toString().toInt() //zczytanie z pola "wiek" wartości wieku
        val wynik1 = bmr_kobieta(
            userInput,
            userInput2,
            userInput3
        )  //odwołanie się do funkcji oblicz w celu wyliczenia BMI na podstawie wprowadzonych przez użytkownika danych
        val wynik2 = bmr_mezczyzna(userInput, userInput2, userInput3)
        val rezultat1 =
            String.format("%.2f", wynik1)  //zaokrąglenie wyniku do dwóch miejsc po przecinku
        val rezultat2 =
            String.format("%.2f", wynik2)  //zaokrąglenie wyniku do dwóch miejsc po przecinku

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup?.setOnCheckedChangeListener { group, checkedId ->
            if (R.id.plec1 == checkedId) {

                val intent = Intent(
                    this,
                    wynik_bmr::class.java
                ).  //uruchomienie drugiej aktywności, w które będzie wyświetlany rezultat - wynik BMI
                apply {
                    putExtra("wynik1", rezultat1)
                }

            }
        }
                startActivity(intent)


    }


        fun bmr_kobieta(x: Int, y: Int, z:Int): Double {  //funkcja służąca do obliczenia ilorazu wagi i kwadratu wzrostu

            return ((9.99 * x) +(6.25*y-4.92 *z)-161)
        }
        fun bmr_mezczyzna(x: Int, y: Int, z:Int): Double {  //funkcja służąca do obliczenia ilorazu wagi i kwadratu wzrostu

            return ((9.99 * x) +(6.25*y-4.92 *z)+ 5)
        }


}


