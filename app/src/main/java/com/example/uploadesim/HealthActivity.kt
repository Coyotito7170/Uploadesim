package com.example.uploadesim

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HealthActivity : AppCompatActivity() {
    lateinit var tvNhif:TextView
    lateinit var tvAmref:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health)
        tvNhif = findViewById(R.id.mTvNhif)
        tvAmref = findViewById(R.id.mTvAmref)

        tvNhif.setOnClickListener {
            startActivity(Intent(this@HealthActivity, NhifActivity::class.java))
        }
        tvAmref.setOnClickListener {
            startActivity(Intent(this@HealthActivity, AmrefActivity::class.java))
        }
    }
}