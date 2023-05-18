package com.example.uploadesim
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EducationActivity : AppCompatActivity() {
    lateinit var tvHelb:TextView
    lateinit var tvKuccps:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_education)
        tvHelb = findViewById(R.id.mTvHelb)
        tvKuccps = findViewById(R.id.mTvKuccps)

        tvKuccps.setOnClickListener {
            startActivity(Intent(this@EducationActivity, KuccpsActivity::class.java))
        }
        tvHelb.setOnClickListener {
            startActivity(Intent(this@EducationActivity, HelbActivity::class.java))
        }
    }
}