package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class KtnActivity : AppCompatActivity() {
    lateinit var webKtn: WebView

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ktn)
        webKtn = findViewById(R.id.webKtn)
        webKtn()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webKtn(){
        webKtn.webViewClient= WebViewClient()
        webKtn.apply {
            loadUrl("https://www.standardmedia.co.ke/ktnnews/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webKtn.canGoBack())webKtn.goBack()else
            super.onBackPressed()
    }
}