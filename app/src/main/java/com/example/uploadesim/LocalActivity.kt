package com.example.uploadesim

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LocalActivity : AppCompatActivity() {
    lateinit var tvPolice:TextView
    lateinit var tvCounty:TextView
    lateinit var tvNation:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_local)
        tvCounty = findViewById(R.id.mTvCounty)
        tvNation = findViewById(R.id.mTvNation)
        tvPolice = findViewById(R.id.mTvPolice)

        tvPolice.setOnClickListener {
            startActivity(Intent(this@LocalActivity, PoliceActivity::class.java))
        }
        tvCounty.setOnClickListener {
            startActivity(Intent(this@LocalActivity, CountyActivity::class.java))
        }
        tvNation.setOnClickListener {
            startActivity(Intent(this@LocalActivity, NationActivity::class.java))
        }
    }
}