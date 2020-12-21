package com.example.examenrecuperacionmultimedia

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class SecondActivity: AppCompatActivity() {

    companion object{
        const val texto = "Hola"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val boton1 = findViewById<Button>(R.id.boton1)
        val editText = findViewById<EditText>(R.id.editText)
        val textView = findViewById<TextView>(R.id.texto)

        textView.text = intent.getStringExtra(texto)


        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                s?.let{
                    if(editText.text.isNotEmpty()){
                        boton1.isEnabled = true
                    }else if(editText.text.isEmpty()){
                        boton1.isEnabled= false
                    }
                    //boton1.isEnabled = editText.text.isNotEmpty()
                    //no entiendo si era lo mismo practicamente porque asi, si me funciona
                }


            }
        })

        boton1.setOnClickListener {
            /*textView?.let {
                val numeroAñadido = Random.nextInt(1, 6)
                var lista= textView.text.split(" ")
                var output = ""
                lista.forEach {

                }


                    //deberia escribir el numero las veces que pone, y añadir la palabra siguiente
                    //no me ha dado tiempo*/
                Toast.makeText(this, "Cambia el texto primero", Toast.LENGTH_LONG).show()
                }




            }


}

