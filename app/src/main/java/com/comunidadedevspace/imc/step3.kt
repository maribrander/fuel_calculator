package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

const val KEY_STEP3_FUEL = "Step3.KEY_STEP3"

class Step3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step3)

        val step3 = intent.getStringExtra("KEY_STEP3")

        val btnNext3 = findViewById<Button>(R.id.button_calculate)
        btnNext3.setOnClickListener {
            val intent = Intent (this, Results::class.java)
            intent.putExtra(KEY_RESULTS_FUEL,0)
            startActivity(intent)
        }

        val thedistance = findViewById<TextInputEditText>(R.id.edtDistance)
    }
}