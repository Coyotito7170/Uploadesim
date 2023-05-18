package com.example.uploadesim

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class RegisterActivity : AppCompatActivity() {
    lateinit var edtFirstName: EditText
    lateinit var edtLastName: EditText
    lateinit var edtEmail: EditText
    lateinit var edtPassword: EditText
    lateinit var edtConfirmPassword: EditText
    lateinit var btnSignup: Button
    lateinit var btnGoogle: Button
    lateinit var btnFacebook: Button
    lateinit var progressDialog: ProgressDialog
    lateinit var tvSignIn: TextView
    lateinit var mAuth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        edtFirstName = findViewById(R.id.mEdtFirstName)
        edtLastName = findViewById(R.id.mEdtLastname)
        edtPassword = findViewById(R.id.mEdtPassword)
        edtConfirmPassword = findViewById(R.id.mEdtConfirmPassword)
        edtEmail = findViewById(R.id.mEdtEmail)
        btnSignup = findViewById(R.id.mBtnSignup)
        btnFacebook = findViewById(R.id.mBtnFacebook)
        btnGoogle = findViewById(R.id.mBtnGoogle)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Loading")
        tvSignIn = findViewById(R.id.mTvSignIn)
        mAuth = FirebaseAuth.getInstance()


        btnSignup.setOnClickListener {
            var firstname = edtFirstName.text.toString().trim()
            var lastname = edtLastName.text.toString().trim()
            var email = edtEmail.text.toString().trim()
            var password = edtPassword.toString().trim()
            var confirmPassword = edtConfirmPassword.toString().trim()
            var userId = System.currentTimeMillis().toString()
            // check if the user is submitting empty fields



            if (firstname.isEmpty()) {
                edtFirstName.setError("Please fill your first name")
                edtFirstName.requestFocus()
            } else if (email.isEmpty()) {
                edtEmail.setError("Please fill your email")
                edtEmail.requestFocus()
            } else if (password.isEmpty()) {
                edtPassword.setError("please fill your password")
                edtPassword.requestFocus()
            } else if (confirmPassword.isEmpty()) {
                edtConfirmPassword.setError("please confirm your password")
                edtConfirmPassword.requestFocus()
            } else if (lastname.isEmpty()) {
                edtLastName.setError("Please fill your Last Name")
                edtLastName.requestFocus()
            }
//            else if (password !=confirmPassword){
//                Toast.makeText(this,"Password do not match",Toast.LENGTH_LONG).show()
//                return@setOnClickListener
//            }


            else {
                progressDialog.show()
                mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                    progressDialog.dismiss()
                    if (it.isSuccessful) {
                        var ref = FirebaseDatabase.getInstance().getReference().child("user"+userId)
                        var userData = User(firstname, lastname, email, password, confirmPassword, mAuth.currentUser!!.uid, userId)
                        ref.setValue(userData)
                        Toast.makeText(this, "User registered successfully", Toast.LENGTH_LONG)
                            .show()
                        mAuth.signOut()
                        startActivity(Intent(this@RegisterActivity,FavFragment::class.java))
                        finish()
                    }else{
                        Toast.makeText(this,"Registration failed",Toast.LENGTH_LONG).show()
                    }
                }


            }
        }

        tvSignIn.setOnClickListener {
            startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
        }
//        btnSignup.setOnClickListener {
//            val intent = Intent(this,FavFragment::class.java)
//            startActivity(intent)
//        }
    }
}