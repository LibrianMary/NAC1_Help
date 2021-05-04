package com.example.nac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val information = intent.getParcelableExtra<Information>(DataScreen.Key_Intent_Information)

        val informacao = findViewById<TextView>(R.id.txtView_Main)
        informacao.text = "Nome: ${information?.name}\n" +
                "Altura: ${information?.altura}\n" +
                "Peso: ${information?.peso}"
    }
}