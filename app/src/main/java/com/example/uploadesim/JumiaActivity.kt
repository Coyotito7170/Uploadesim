package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class JumiaActivity : AppCompatActivity() {
    lateinit var webJumia:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jumia)
        webJumia = findViewById(R.id.webJumia)
        webJumia()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webJumia(){
        webJumia.webViewClient= WebViewClient()
        webJumia.apply {
            loadUrl("https://www.jumia.co.ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webJumia.canGoBack())webJumia.goBack()else
            super.onBackPressed()
    }
}