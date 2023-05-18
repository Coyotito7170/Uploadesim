package com.example.uploadesim

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class PoliceActivity : AppCompatActivity() {
    lateinit var webPolice:WebView
    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_police)
        webPolice = findViewById(R.id.webPolice)
        webPolice()
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webPolice(){
        webPolice.webViewClient= WebViewClient()
        webPolice.apply {
            loadUrl("https://www.bing.com/search?q=nearest+police+station&cvid=e09bed3e50874307853958803db5a0af&aqs=edge.0.0j69i57j0l7.8464j0j4&FORM=ANAB01&PC=U531")
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
        }
    }

    override fun onBackPressed() {
        if (webPolice.canGoBack())webPolice.goBack()else
            super.onBackPressed()
    }
}