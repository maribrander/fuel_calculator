package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class Step3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step3)

        val consumption = intent.getFloatExtra("KEY_STEP3_FUEL", 0f)
        val price = intent.getFloatExtra("KEY_STEP2_FUEL", 0f)

        val btnNext3 = findViewById<Button>(R.id.button_calculate)

        btnNext3.setOnClickListener {
            val dstnc = findViewById<TextInputEditText>(R.id.edtDistance)
            val d_istance = dstnc.text.toString()

            if (d_istance.isEmpty()) {
                dstnc.error = "Preencha o campo vazio"
            } else {
                val distance = d_istance.toFloat()
                val intent = Intent(this, Results::class.java)
                intent.putExtra("KEY_STEP2_FUEL", price)
                intent.putExtra("KEY_STEP3_FUEL", consumption)
                intent.putExtra("KEY_RESULTS", distance)
                startActivity(intent)
            }
        }
    }
}
