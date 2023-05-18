package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class KilimalActivity : AppCompatActivity() {
    lateinit var webKilimall:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kilimal)
        webKilimall = findViewById(R.id.webKilimall)
        webKilimall()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webKilimall(){
        webKilimall.webViewClient= WebViewClient()
        webKilimall.apply {
            loadUrl("https://www.kilimall.co.ke/new/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webKilimall.canGoBack())webKilimall.goBack()else
            super.onBackPressed()
    }
}