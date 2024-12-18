package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

const val KEY_STEP1_FUEL = "Step1.KEY_STEP1"

class Step1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step1)

        val step1 = intent.getStringExtra("KEY_STEP1")

        val btnNext1 = findViewById<Button>(R.id.button_next1)
        btnNext1.setOnClickListener {
            val intent = Intent (this, Step2::class.java)
            intent.putExtra(KEY_STEP2_FUEL,0)
            startActivity(intent)
         }

        val theprice = findViewById<TextInputEditText>(R.id.edtPrice)
    }
}