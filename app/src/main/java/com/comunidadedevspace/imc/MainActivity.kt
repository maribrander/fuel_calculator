package com.comunidadedevspace.imc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

const val KEY_NEWCALC_FUEL = "Main.KEY_NEWCALC"

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val main = intent.getStringExtra("KEY_NEWCALC")

    val btnStart = this.findViewById<Button>(R.id.button_start)

        btnStart.setOnClickListener {
            val intent = Intent (this, Step1::class.java)
            intent.putExtra(KEY_STEP1_FUEL,0)
            startActivity(intent)

        }
    }
}