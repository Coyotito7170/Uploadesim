package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class EquityActivity : AppCompatActivity() {
    lateinit var webEquity:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equity)
        webEquity = findViewById(R.id.webEquity)
        webEquity()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webEquity(){
        webEquity.webViewClient= WebViewClient()
        webEquity.apply {
            loadUrl("https://equitygroupholdings.com/ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webEquity.canGoBack())webEquity.goBack()else
            super.onBackPressed()
    }
}