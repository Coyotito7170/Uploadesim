package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class ProgasAcrivity : AppCompatActivity() {
    lateinit var webProGas:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_progas_acrivity)
        webProGas = findViewById(R.id.webProGas)
        webProGas()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webProGas(){
        webProGas.webViewClient= WebViewClient()
        webProGas.apply {
            loadUrl("https://www.progas.co.ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webProGas.canGoBack())webProGas.goBack()else
            super.onBackPressed()
    }
}