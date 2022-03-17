package com.carvalho.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnD6 = findViewById<Button>(R.id.btnD6)
        val btnD12 = findViewById<Button>(R.id.btnD12)
        val btnD20 = findViewById<Button>(R.id.btnD20)
        val txtIdenti = findViewById<TextView>(R.id.txtIdentificador)

        btnD6.setOnClickListener {
            girarDados(6)
            txtIdenti.text = "D6"
        }

        btnD12.setOnClickListener {
            girarDados(12)
            txtIdenti.text = "D12"
        }

        btnD20.setOnClickListener {
            girarDados(20)
            txtIdenti.text = "D20"
        }
    }

    private fun girarDados(valor: Int) {

        val lados = (1..valor).random()
        val txtResultado = findViewById<TextView>(R.id.txtDice)

        txtResultado.text = lados.toString()

    }
}