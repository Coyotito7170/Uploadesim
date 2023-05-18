package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MgasActivity : AppCompatActivity() {
    lateinit var webMgas:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mgas)
        webMgas = findViewById(R.id.webMgas)
        webMgas()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webMgas(){
        webMgas.webViewClient= WebViewClient()
        webMgas.apply {
            loadUrl("https://mgas.ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webMgas.canGoBack())webMgas.goBack()else
            super.onBackPressed()
    }
}