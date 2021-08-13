package com.example.calculadora

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = calcular
        val resultado = resultado

        btnCalcular.setOnClickListener {
            //Transformando a informação em texto e convertendo para Inteiro
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val faltas = Integer.parseInt(faltas.text.toString())
            val media =  (nota1 + nota2 ) / 2

            if(media < 6 || faltas > 10){
                resultado.setText("Aluno(a) foi Reprovado" + "\n"+ "Nota final:" + media + "\n"+ "Faltas:" + faltas)
                resultado.setTextColor(Color.RED)
            }
            else {
                resultado.setText("Aluno(a) Aprovado" + "\n" + "Nota final: " + media + "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.GREEN)
            }
        }
    }
}