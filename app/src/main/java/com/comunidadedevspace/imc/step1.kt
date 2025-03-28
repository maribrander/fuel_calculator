package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class Step1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step1)


        val btnNext1 = findViewById<Button>(R.id.button_next1)

        btnNext1.setOnClickListener {

            val prc = findViewById<TextInputEditText>(R.id.edtPrice)
            val p_rice = prc.text.toString()

            if (p_rice.isEmpty()) {
                prc.error = "Preencha o campo vazio"
            } else {
                val price = p_rice.toFloat()
                val intent = Intent(this, Step2::class.java)
                intent.putExtra("KEY_STEP2_FUEL", price)
                startActivity(intent)
            }

        }
    }
}