package com.example.uploadesim

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigatorActivity() : AppCompatActivity(), Parcelable {
    lateinit var tvFinancialServices:TextView
    private lateinit var navController: NavController

    constructor(parcel: Parcel) : this() {

    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NavigatorActivity> {
        override fun createFromParcel(parcel: Parcel): NavigatorActivity {
            return NavigatorActivity(parcel)
        }

        override fun newArray(size: Int): Array<NavigatorActivity?> {
            return arrayOfNulls(size)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigator)


        tvFinancialServices = findViewById(R.id.mTvFinancialServices)

        tvFinancialServices.setOnClickListener{
            var intent = Intent(this@NavigatorActivity,FinancialActivity::class.java)
            startActivity(intent)}

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
        navController = navHostFragment.navController
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        setupWithNavController(bottomNavigationView , navController)
    }
}