package com.example.nac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = intent.getParcelableExtra<User>(DataScreen.Key_Intent_User)

        val show = findViewById<TextView>(R.id.txtView_Main)
        show.text = "Nome: ${user?.name}\n" +
                "Altura: ${user?.height}\n" +
                "Peso: ${user?.height}"
    }
}