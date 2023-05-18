package com.example.uploadesim

import android.annotation.SuppressLint
import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    lateinit var tvSignUp: TextView
    lateinit var edtEmail: EditText
    lateinit var edtPassword: EditText
    lateinit var tvForgotPassword: TextView
    lateinit var btnSignIn: Button
    lateinit var btnGoogle: Button
    lateinit var btnFacebook: Button
    lateinit var progressDialog: ProgressDialog
    lateinit var tvViewProfile: TextView
    lateinit var tvViewHome: TextView
    lateinit var mAuth: FirebaseAuth

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edtPassword = findViewById(R.id.mEdtPassword)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Loading")
        edtEmail = findViewById(R.id.mEdtEmail)
        btnFacebook = findViewById(R.id.mBtnFacebook)
        btnGoogle = findViewById(R.id.mBtnGoogle)
        tvForgotPassword = findViewById(R.id.mTvForgotPassword)
        btnSignIn = findViewById(R.id.mBtnSignin)
        tvSignUp = findViewById(R.id.mTvSignup)
        tvViewProfile = findViewById(R.id.mTvViewProfile)
        tvViewHome = findViewById(R.id.mTvViewHome)
        mAuth = FirebaseAuth.getInstance()

        tvSignUp.setOnClickListener{
            var intent = Intent(this@LoginActivity,RegisterActivity::class.java)
            startActivity(intent)
        }
        tvViewProfile.setOnClickListener{
            var intent = Intent(this@LoginActivity,ProfileActivity::class.java)
            startActivity(intent)
        }
        tvViewHome.setOnClickListener{
            var intent = Intent(this@LoginActivity,NavigatorActivity::class.java)
            startActivity(intent)
        }

        btnSignIn.setOnClickListener{
            var email = edtEmail.text.toString().trim()
            var password = edtPassword.text.toString().trim()
            startActivity(Intent(this@LoginActivity,ProfileActivity::class.java))

            if (email.isEmpty()|| password.isEmpty()){
                val intent = Intent(this,FavFragment::class.java)
                startActivity(intent)
                Toast.makeText(this, "Please fill all inputs", Toast.LENGTH_LONG).show()

            }else{
                progressDialog.show()
                mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    progressDialog.dismiss()
                    if (it.isSuccessful){
                        Toast.makeText(this,"User logged in successfully", Toast.LENGTH_LONG).show()
                        startActivity(Intent(this@LoginActivity,ProfileActivity::class.java))
                        finish()
                    }else{
                        Toast.makeText(this,"Login failed", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }


    }
}