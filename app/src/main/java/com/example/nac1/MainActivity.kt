package com.example.nac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = intent.getParcelableExtra<User>(DataScreen.Key_Intent_User)

        val name = user?.name
        val height = user?.height
        val weight = user?.weight

        val peso = weight.toString()
        val p: Double = peso.toDouble()

        val altura = height.toString()
        val a = altura.toDouble()

        val imc = p/(a*a)

        val show = findViewById<TextView>(R.id.txtView_Main)
        show.text = "Nome: ${name}\n" +
                "Altura: ${height}\n" +
                "Peso: ${weight}\n" +
                "IMC: ${imc}"
    }
}