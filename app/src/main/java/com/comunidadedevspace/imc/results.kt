package com.comunidadedevspace.imc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

const val KEY_RESULTS_FUEL = "Step1.KEY_STEP3"


class results : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        val result = intent.getStringExtra("KEY_STEP3")

        }
    }