package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = this.findViewById<Button>(R.id.button_start)

        btnStart.setOnClickListener {
            val intent = Intent(this, Step1::class.java)
            intent.putExtra("KEY_STEP1_FUEL", 0.1f)
            startActivity(intent)

        }
    }
}