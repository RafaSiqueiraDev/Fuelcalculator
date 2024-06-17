package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class DistanceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_distance)


            val edt_distancia = findViewById<TextInputEditText>(R.id.edt_distancia)

            val btn_distancia = findViewById<Button>(R.id.btn_distancia)

            // criar uma nova tela e  ajustar intent abaixo

            btn_distancia.setOnClickListener{
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
        }
    }
}