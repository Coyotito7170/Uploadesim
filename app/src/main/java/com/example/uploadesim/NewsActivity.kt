package com.example.uploadesim

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NewsActivity : AppCompatActivity() {
    lateinit var tvCitizen:TextView
    lateinit var tvNtv:TextView
    lateinit var tvKtn:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        tvCitizen = findViewById(R.id.mTvCitizen)
        tvKtn= findViewById(R.id.mTvKtn)
        tvNtv = findViewById(R.id.mTvNtv)

        tvCitizen.setOnClickListener {
            startActivity(Intent(this@NewsActivity, CitizenActivity::class.java))
        }
        tvNtv.setOnClickListener {
            startActivity(Intent(this@NewsActivity, NtvActivity::class.java))
        }
        tvKtn.setOnClickListener {
            startActivity(Intent(this@NewsActivity, KtnActivity::class.java))
        }
    }
}