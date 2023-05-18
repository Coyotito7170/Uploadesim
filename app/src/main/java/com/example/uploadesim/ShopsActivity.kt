package com.example.uploadesim

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShopsActivity : AppCompatActivity() {
    lateinit var tvJumia:TextView
    lateinit var tvJiji:TextView
    lateinit var tvKilimall:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shops)
        tvJiji = findViewById(R.id.mTvJiji)
        tvJumia = findViewById(R.id.mTvJumia)
        tvKilimall = findViewById(R.id.mTvKilimall)

        tvJumia.setOnClickListener {
            startActivity(Intent(this@ShopsActivity, JumiaActivity::class.java))
        }
        tvKilimall.setOnClickListener {
            startActivity(Intent(this@ShopsActivity, KilimalActivity::class.java))
        }
        tvJiji.setOnClickListener {
            startActivity(Intent(this@ShopsActivity, JijiActivity::class.java))
        }
    }
}