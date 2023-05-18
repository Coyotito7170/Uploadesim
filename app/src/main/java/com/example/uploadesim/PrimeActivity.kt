package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class PrimeActivity : AppCompatActivity() {
    lateinit var webPrime:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prime)
        webPrime = findViewById(R.id.webPrime)
        webPrime()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webPrime(){
        webPrime.webViewClient= WebViewClient()
        webPrime.apply {
            loadUrl("https://www.primevideo.com/offers/nonprimehomepage/ref=atv_dl_rdr")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webPrime.canGoBack())webPrime.goBack()else
            super.onBackPressed()
    }
}