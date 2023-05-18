package com.example.uploadesim

import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class EnaCoachActivity : AppCompatActivity() {
    lateinit var webEnaCoach:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ena_coach)
        webEnaCoach = findViewById(R.id.webEnaCoach)
        webEnaCoach()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webEnaCoach(){
        webEnaCoach.webViewClient= WebViewClient()
        webEnaCoach.apply {
            loadUrl("http://www.enacoach.co.ke/#/")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webEnaCoach.canGoBack())webEnaCoach.goBack()else
            super.onBackPressed()
    }
}