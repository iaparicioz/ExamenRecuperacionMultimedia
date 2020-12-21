package com.example.examenrecuperacionmultimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val BotonLimpiar = findViewById<Button>(R.id.primero)
        val BotonAñadirNumero = findViewById<Button>(R.id.segundo)
        val BotonSiguiente = findViewById<Button>(R.id.tercero)
        val textView = findViewById<TextView>(R.id.texto)


        BotonLimpiar.setOnClickListener{
            textView.setText("")
            BotonLimpiar.isEnabled = textView.text.isNotEmpty()
        }

        BotonAñadirNumero.setOnClickListener {
            textView?.let {
                val textoAñadido = it.text
                it.text = "$textoAñadido ${ Random.nextInt(9999,100000)}"
                BotonLimpiar.isEnabled = textView.text.isNotEmpty()
                BotonSiguiente.isEnabled = textView.text.isNotEmpty()
            }
        }

        BotonSiguiente.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra(SecondActivity.texto, textView.toString())
            startActivity(intent)
        }
    }
}