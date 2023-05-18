package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class NetflixActivity : AppCompatActivity() {
    lateinit var webNetflix:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netflix)
        webNetflix = findViewById(R.id.webNetflix)
        webNetflix()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webNetflix(){
        webNetflix.webViewClient= WebViewClient()
        webNetflix.apply {
            loadUrl("https://www.netflix.com/ke/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webNetflix.canGoBack())webNetflix.goBack()else
            super.onBackPressed()
    }
}