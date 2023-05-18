package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class HelbActivity : AppCompatActivity() {
    lateinit var webHelb: WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_helb)
        webHelb = findViewById(R.id.webHelb)
        webHelb()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webHelb(){
        webHelb.webViewClient= WebViewClient()
        webHelb.apply {
            loadUrl("https://www.helb.co.ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webHelb.canGoBack())webHelb.goBack()else
            super.onBackPressed()
    }
}