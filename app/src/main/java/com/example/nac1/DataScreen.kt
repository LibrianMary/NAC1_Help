package com.example.nac1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.nac1.databinding.ActivityDataScreenBinding

class DataScreen : AppCompatActivity() {

    private lateinit var binding: ActivityDataScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_screen)
        binding = ActivityDataScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            calculateBt.setOnClickListener {
                val name = txtName.text.toString()
                val altura = txtAltura.text.toString()
                val peso = txtPeso.text.toString()

                val intent = Intent(this@DataScreen, MainActivity::class.java)

                var x: Int = 0

                if (name.isBlank()){
                    txtFieldName.error = getString(R.string.Error_msg)
                } else {
                    txtFieldName.isErrorEnabled = false
                    x += 1
                }

                if (altura.isBlank()){
                    txtFieldAltura.error = getString(R.string.Error_msg)
                } else {
                    txtFieldAltura.isErrorEnabled = false
                    x += 1
                }

                if (peso.isBlank()){
                    txtFieldPeso.error = getString(R.string.Error_msg)
                } else {
                    txtFieldPeso.isErrorEnabled = false
                    x += 1
                }

                if (x == 3)
                {
                    Toast.makeText(this@DataScreen, getString(R.string.success), Toast.LENGTH_SHORT).show()
                    startActivity(intent)
                }

                val information = Information(
                    name = name,
                    altura = altura,
                    peso = peso
                )

                intent.putExtra(Key_Intent_Information, information)
            }
        }
    }

    companion object {
        const val Key_Intent_Information = "information"
    }
}