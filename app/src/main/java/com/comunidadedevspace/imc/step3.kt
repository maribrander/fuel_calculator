package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_STEP3_FUEL = "Step1.KEY_STEP3"

class step3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step3)

        val step3 = intent.getStringExtra("KEY_STEP3")

        val btnNext1 = findViewById<Button>(R.id.button_calculate)
        btnNext1.setOnClickListener {
            val intent = Intent (this, results::class.java)
            intent.putExtra(KEY_RESULTS_FUEL,0)
            startActivity(intent)

        }
    }
}