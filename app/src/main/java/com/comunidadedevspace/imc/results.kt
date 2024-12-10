package com.comunidadedevspace.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

const val KEY_RESULTS_FUEL = "Results.KEY_RESULTS"

class Results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val result = intent.getStringExtra("KEY_RESULTS")

        val btnNewCalc = findViewById<Button>(R.id.button_newcalc)
        btnNewCalc.setOnClickListener {
            val intent = Intent (this, MainActivity::class.java)
            intent.putExtra(KEY_NEWCALC_FUEL,0)
            startActivity(intent)
            finish ()

        }

    }
}