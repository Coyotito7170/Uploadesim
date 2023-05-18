package com.example.uploadesim

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TravelActivity : AppCompatActivity() {
    lateinit var tvAirways:TextView
    lateinit var tvEasyCoach:TextView
    lateinit var tvEnaCoach:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
        tvAirways = findViewById(R.id.mTvAirways)
        tvEasyCoach = findViewById(R.id.mTvEasyCoach)
        tvEnaCoach = findViewById(R.id.mTvEnaCoach)

        tvAirways.setOnClickListener {
            startActivity(Intent(this@TravelActivity, KenyaAirwaysActivity::class.java))
        }
        tvEnaCoach.setOnClickListener {
            startActivity(Intent(this@TravelActivity, EnaCoachActivity::class.java))
        }
        tvEasyCoach.setOnClickListener {
            startActivity(Intent(this@TravelActivity, EasyCoach ::class.java))
        }

    }
}