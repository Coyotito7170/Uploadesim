package com.example.uploadesim

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GasActivity : AppCompatActivity() {
    lateinit var tvTotal:TextView
    lateinit var tvProGas:TextView
    lateinit var tvMgas:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gas)
        tvTotal = findViewById(R.id.mTvTotal)
        tvProGas = findViewById(R.id.mTvProGas)
        tvMgas = findViewById(R.id.mTvMgas)

        tvTotal.setOnClickListener {
            startActivity(Intent(this@GasActivity, TotalActivity::class.java))
        }
        tvProGas.setOnClickListener {
            startActivity(Intent(this@GasActivity, ProgasAcrivity::class.java))
        }
        tvMgas.setOnClickListener {
            startActivity(Intent(this@GasActivity, MgasActivity::class.java))
        }
    }
}