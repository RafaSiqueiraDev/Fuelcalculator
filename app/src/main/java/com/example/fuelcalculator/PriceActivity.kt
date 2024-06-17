package com.example.fuelcalculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class PriceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_price)

        val edt_preco = findViewById<TextInputEditText>(R.id.edt_preco)

        val btn_preco = findViewById<Button>(R.id.btn_preco)

        btn_preco.setOnClickListener{

            val intent = Intent(this, ConsumptionActivity::class.java)
            startActivity(intent)

        }
    }
}