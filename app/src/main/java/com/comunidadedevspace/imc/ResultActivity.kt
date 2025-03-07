package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

const val KEY_RESULT_IMC= "ResultActivity.KEY_IMC"

class ResultActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

         val result =intent.getFloatExtra(KEY_RESULT_IMC,0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao =findViewById<TextView>(R.id.tv_classificacao)
        tvResult.text=result.toString()

        val classificao: String = when {
            result <= 18.5f -> {

                tvClassificacao.setTextColor(resources.getColor(R.color.magreza))
                "Magreza"
            }
            result in 18.5f..24.9f -> {

                tvClassificacao.setTextColor(resources.getColor(R.color.normal))
                "Normal"
            }
            result in 25f..29.9f -> {

                tvClassificacao.setTextColor(resources.getColor(R.color.sobrepeso))
                "SOBREPESO"
            }
            result in 30f..39.9f -> {

                tvClassificacao.setTextColor(resources.getColor(R.color.obesidade))
                "OBESIDADE"
            }
            else -> {

                tvClassificacao.setTextColor(resources.getColor(R.color.obesidade_grave))
                "OBESIDADE GRAVE"
            }
        }




        tvClassificacao.text = classificao

            }
        }




