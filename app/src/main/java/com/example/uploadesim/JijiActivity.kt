package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class JijiActivity : AppCompatActivity() {
    lateinit var webJiji:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jiji)
        webJiji = findViewById(R.id.webJiji)
        webJiji()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webJiji(){
        webJiji.webViewClient= WebViewClient()
        webJiji.apply {
            loadUrl("https://jiji.co.ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webJiji.canGoBack())webJiji.goBack()else
            super.onBackPressed()
    }
}