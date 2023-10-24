package com.example.ejerciciocalificacion

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etNumber: EditText
    private lateinit var bValidation: Button
    private lateinit var tvMessageError: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumber = findViewById(R.id.etNumber)
        bValidation = findViewById(R.id.bValidation)
        tvMessageError = findViewById(R.id.tvMessageError)


        bValidation.setOnClickListener{
            var number = etNumber.text.toString()

            if(number.isNotEmpty()) {
                if (number.toInt() >= 0 && number.toInt() <= 5) {
                    tvMessageError.text = "Has reprovado"
                    tvMessageError.setTextColor(resources.getColor(R.color.red))
                } else if (number.toInt() >= 6 && number.toInt() <= 9) {
                    tvMessageError.text = "Has aprovado"
                    tvMessageError.setTextColor(resources.getColor(R.color.green))
                } else if (number.toInt() == 10) {
                    tvMessageError.text = "Tienes un promedio excelente"
                    tvMessageError.setTextColor(resources.getColor(R.color.black))
                } else {
                    tvMessageError.text = "Favor de colocar un numero entre 0 y 10"
                    tvMessageError.setTextColor(resources.getColor(R.color.red))
                }
            }else{
                tvMessageError.text = "El campo esta vacio"
                tvMessageError.setTextColor(resources.getColor(R.color.red))
            }
        }


    }
}