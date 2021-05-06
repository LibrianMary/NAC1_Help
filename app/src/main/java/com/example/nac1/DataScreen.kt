package com.example.nac1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.nac1.databinding.ActivityDataScreenBinding

class DataScreen : AppCompatActivity() {

    private lateinit var binding: ActivityDataScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDataScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            binding.calculateBt.setOnClickListener {
                val name = txtName.text.toString()
                val height = txtHeight.text.toString()
                val weight = txtPeso.text.toString()

                var x = 0

                val intent = Intent(this@DataScreen, MainActivity::class.java)

                val user = User(
                    name = name,
                    height = height,
                    weight = weight
                )

                intent.putExtra(Key_Intent_User, user)

                if (name.isBlank()){
                    txtFieldName.error = getString(R.string.Error_msg)
                } else {
                    txtFieldName.isErrorEnabled = false
                    x += 1
                }
                if (height.isBlank()){
                    txtFieldHeight.error = getString(R.string.Error_msg)
                } else {
                    txtFieldHeight.isErrorEnabled = false
                    x += 1
                }
                if (weight.isBlank()){
                    txtFieldPeso.error = getString(R.string.Error_msg)
                } else {
                    txtFieldPeso.isErrorEnabled = false
                    x += 1
                }

                if (x == 3){
                    Toast.makeText(
                            this@DataScreen,
                            getString(R.string.success),
                            Toast.LENGTH_SHORT
                    ).show()
                    startActivity(intent)
                }


            }
        }
    }

    companion object{
        const val Key_Intent_User = "user"
    }
}
