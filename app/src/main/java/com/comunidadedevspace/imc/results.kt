package com.comunidadedevspace.imc

import android.content.Intent
import android.icu.text.DecimalFormat
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class Results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val consumption = intent.getFloatExtra("KEY_STEP3_FUEL", 0f)
        val price = intent.getFloatExtra("KEY_STEP2_FUEL", 0f)
        val distance = intent.getFloatExtra("KEY_RESULTS", 0f)

        val calculate = (distance / consumption) * price
        val result = calculate.toString()

        val tvResult = findViewById<TextView>(R.id.result)
        val tvPrice = findViewById<TextView>(R.id.textPrice)
        val tvConsump = findViewById<TextView>(R.id.textConsump)
        val tvKm = findViewById<TextView>(R.id.textKm)

        tvResult.text = ConvertToBrl(result)
        tvPrice.text = ConvertToBrl(price.toString())
        tvConsump.text = consumption.toString()
        tvKm.text = distance.toString()

        val btnNewCalc = findViewById<Button>(R.id.button_newcalc)
        btnNewCalc.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}

fun ConvertToBrl(value: String): String {
    val format = DecimalFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"))
    val valueDouble = value.toDouble()
    return format.format(valueDouble)
}