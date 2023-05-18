package com.example.uploadesim

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EntertainmentActivity : AppCompatActivity() {
    lateinit var tvNetflix:TextView
    lateinit var tvGojara:TextView
    lateinit var tvPrimeVideos:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entertainment)
        tvNetflix = findViewById(R.id.mTvNetflix)
        tvGojara = findViewById(R.id.mTvGojara)
        tvPrimeVideos = findViewById(R.id.mTvPrime)

        tvNetflix.setOnClickListener {
            startActivity(Intent(this@EntertainmentActivity, NetflixActivity::class.java))
        }

        tvGojara.setOnClickListener {
            startActivity(Intent(this@EntertainmentActivity, GojaraActivity::class.java))
        }

        tvPrimeVideos.setOnClickListener {
            startActivity(Intent(this@EntertainmentActivity, PrimeActivity::class.java))
        }

    }
}