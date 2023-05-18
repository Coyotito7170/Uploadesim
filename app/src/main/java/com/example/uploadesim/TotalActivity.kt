package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class TotalActivity : AppCompatActivity() {
    lateinit var webTotal:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_total)
        webTotal = findViewById(R.id.webTotal)
        webTotal()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webTotal(){
        webTotal.webViewClient= WebViewClient()
        webTotal.apply {
            loadUrl("https://totalenergies.ke/find-a-station")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webTotal.canGoBack())webTotal.goBack()else
            super.onBackPressed()
    }
}