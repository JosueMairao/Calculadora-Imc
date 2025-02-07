package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //  Recuperar os componentes Edittext
           // criar uma variavel e associar(=) o componente de UI<EditText>
          // recupera o botao da tela
        // colocar  acao no botao setonClicklistener
        // recuperar o texto digitado no edt peso

        val edtpeso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edtaltura =findViewById<TextInputEditText>(R.id.edt_altura)

        val btncalcular =findViewById<Button>(R.id.btn_calcular)

        btncalcular.setOnClickListener {

            
            val pesoStr: String= edtpeso.text.toString()
            val alturaStr:String = edtaltura.text.toString()

            if(pesoStr == "" || alturaStr == "") {
                // mostrar mensagem para usuario

                Snackbar.make(
                    edtpeso,
                    "preencha todos campos",
                    Snackbar.LENGTH_LONG
                )
                    .show()

            } else{
             val  peso =pesoStr.toFloat()
             val  altura = alturaStr.toFloat()

            val alturaQ2= altura * altura
            val resultado =peso /alturaQ2



            println("roque acao do botao" + resultado)
             }
         }

     }
}