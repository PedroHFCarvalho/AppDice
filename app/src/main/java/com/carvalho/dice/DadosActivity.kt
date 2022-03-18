package com.carvalho.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DadosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        val textIdent = findViewById<TextView>(R.id.txtIdent)
        val btnVoltar = findViewById<Button>(R.id.btnBack)
        val btnGirar = findViewById<Button>(R.id.btnGirar)
        val imgDice = findViewById<ImageView>(R.id.imgDice)
        val ident = intent.getIntExtra("TIPO", 0)



        when (ident) {
            6 -> {
                textIdent.text = getString(R.string.d6)
                girarDados(ident)
                imgDice.setImageResource(R.drawable.dice6)
            }
            12 -> {

                textIdent.text = getString(R.string.d12)
                girarDados(ident)
                imgDice.setImageResource(R.drawable.dice12)
            }
            20 -> {

                textIdent.text = getString(R.string.d20)
                girarDados(ident)
                imgDice.setImageResource(R.drawable.dice20)
            }
            else -> {
                Toast.makeText(this, "Erro na idantificação", Toast.LENGTH_LONG).show()
            }
        }

        btnGirar.setOnClickListener {
            girarDados(ident)
        }


        btnVoltar.setOnClickListener {
            finish()
        }

    }

    private fun girarDados(valor: Int) {

        val lados = (1..valor).random()
        val txtResultado = findViewById<TextView>(R.id.txtDice)

        txtResultado.text = lados.toString()

    }
}