package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

const val KEY_STEP2_FUEL = "Step2.KEY_STEP2"

class Step2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step2)

        val step2 = intent.getStringExtra("KEY_STEP2")

        val btnNext2 = findViewById<Button>(R.id.button_next2)
        btnNext2.setOnClickListener {
            val intent = Intent (this, Step3::class.java)
            intent.putExtra(KEY_STEP3_FUEL,0)
            startActivity(intent)

        }

        val theconsumption = findViewById<TextInputEditText>(R.id.edtConsumption)
    }
}

