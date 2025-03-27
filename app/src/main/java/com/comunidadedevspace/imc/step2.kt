package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class Step2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step2)

        val price = intent.getFloatExtra("KEY_STEP2_FUEL", 0f)

        val btnNext2 = findViewById<Button>(R.id.button_next2)

        btnNext2.setOnClickListener {

            val cnsptn = findViewById<TextInputEditText>(R.id.edtConsumption)
            val c_onsump = cnsptn.text.toString()

            if (c_onsump.isEmpty()) {
                cnsptn.error = "Preencha o campo vazio"
            } else {
                val consumption = c_onsump.toFloat()
                val intent = Intent(this, Step3::class.java)
                intent.putExtra("KEY_STEP2_FUEL", price)
                intent.putExtra("KEY_STEP3_FUEL", consumption)
                startActivity(intent)
            }
        }

    }
}


