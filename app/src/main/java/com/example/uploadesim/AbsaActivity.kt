package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class AbsaActivity : AppCompatActivity() {
    lateinit var webAbsa:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absa)
        webAbsa = findViewById(R.id.webAbsa)
        webAbsa()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webAbsa(){
        webAbsa.webViewClient= WebViewClient()
        webAbsa.apply {
            loadUrl("https://www.absabank.co.ke/app-online-and-other-banking/internet-banking/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webAbsa.canGoBack())webAbsa.goBack()else
            super.onBackPressed()
    }
}