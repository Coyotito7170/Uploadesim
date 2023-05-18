package com.example.uploadesim

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.SearchView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class FinancialActivity : AppCompatActivity() {
    lateinit var tvKcbMpesa:TextView
    lateinit var tvMshwari:TextView
    lateinit var tvHustlerFund:TextView

    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private  var mList = ArrayList<FinancialData>()
    private lateinit var adapter: LanguageAdapter
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_financial)

        tvHustlerFund = findViewById(R.id.mTvHustlerFund)
        tvMshwari = findViewById(R.id.mTvMshwari)
        tvKcbMpesa = findViewById(R.id.mTvKcbMpesa)

        tvKcbMpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        tvMshwari.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")

            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        tvHustlerFund.setOnClickListener {
            val phone = "*254#"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }



    }



}