package com.example.nac1

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputBinding
import com.example.nac1.databinding.ActivityInfoBinding

class Info_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            binding.euBt.setOnClickListener {
                startActivity(Intent(this@Info_Activity, DataScreen::class.java))
            }
        }
    }
}