package com.example.uploadesim

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class ProfileActivity : AppCompatActivity() {
    var pickedPhoto : Uri? = null
    var pickedBitmap : Bitmap? = null
    lateinit var imageView : ImageView
    lateinit var mEdtName : TextView
    lateinit var mBtnHome : Button
    lateinit var mBtnTransactions : Button
    lateinit var mBtnSpending : Button
    lateinit var mBtnCallSupport : Button
    lateinit var mBtnSms : Button
    lateinit var mBtnNetworkProvider : Button
    lateinit var mBtnFacebook : Button
    lateinit var mBtnInstagram : Button
    lateinit var mBtnYoutube : Button
    lateinit var mBtnShare : Button
    lateinit var mBtnLogOut : Button
    lateinit var mBtnRate : Button
    lateinit var mBtnTermsConditions : Button
    lateinit var mBtnPrivacyPolicy : Button
    lateinit var mBtnEmail: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        imageView = findViewById(R.id.imageView)
        mBtnCallSupport = findViewById(R.id.mBtnCallSupport)
        mBtnFacebook = findViewById(R.id.mBtnFacebook)
        mBtnSms = findViewById(R.id.mBtnSms)
        mBtnHome = findViewById(R.id.mBtnHome)
        mBtnInstagram = findViewById(R.id.mBtnInstagram)
        mBtnLogOut = findViewById(R.id.mBtnLogOut)
        mBtnNetworkProvider = findViewById(R.id.mBtnNetworkProvider)
        mBtnPrivacyPolicy = findViewById(R.id.mBtnPrivacyPolicy)
        mBtnRate = findViewById(R.id.mBtnRate)
        mBtnYoutube = findViewById(R.id.mBtnYoutube)
        mBtnTermsConditions = findViewById(R.id.mBtnTermsConditions)
        mBtnShare = findViewById(R.id.mBtnShare)
        mBtnSpending = findViewById(R.id.mBtnSpending)
        mEdtName = findViewById(R.id.mEdtName)
        mBtnTransactions = findViewById(R.id.mBtnTransactions)
        mBtnEmail = findViewById(R.id.mBtnEmail)



        mBtnSms.setOnClickListener{
            val uri = Uri.parse("smsto:0792825570")

            val intent = Intent(Intent.ACTION_SENDTO, uri)

            intent.putExtra("Hello", "How is the application  to function")

            startActivity(intent)
        }
        mBtnCallSupport.setOnClickListener {
            val phone = "+254792825570"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))

            startActivity(intent)

        }
        mBtnShare.setOnClickListener{
            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

            shareIntent.type = "text/plain"

            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hey, download this app!")

            startActivity(shareIntent)
        }
        mBtnEmail.setOnClickListener{
            val emailIntent =
                Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "titoedwin045@gmail.com", null))

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject")

            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body")

            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        mBtnLogOut.setOnClickListener {
            startActivity(Intent(this@ProfileActivity, LoginActivity::class.java))
        }
        mBtnHome.setOnClickListener{
            startActivity(Intent(this@ProfileActivity, FavFragment::class.java))
        }
        mBtnNetworkProvider.setOnClickListener{
            startActivity(Intent(this@ProfileActivity, SafaricomActivity::class.java))

        }
        mBtnFacebook.setOnClickListener{
            startActivity(Intent(this@ProfileActivity, UploadActivity::class.java))

        }
        mBtnInstagram.setOnClickListener{
            startActivity(Intent(this@ProfileActivity, UploadActivity::class.java))

        }
        mBtnYoutube.setOnClickListener{
            startActivity(Intent(this@ProfileActivity, UploadActivity::class.java))

        }


    }
    fun pickedPhoto (view: View) {
        if (ContextCompat.checkSelfPermission(this,android.Manifest.permission.READ_EXTERNAL_STORAGE)
          != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
            1)
        }else{
            val galleryIntext = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(galleryIntext,2)
        }
    }
    override  fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            val galleryIntext = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(galleryIntext,2)
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 2 && resultCode == RESULT_OK && data != null){
            pickedPhoto = data.data
            if (pickedPhoto != null){

            }
            if (Build.VERSION.SDK_INT >= 28){
                val source = ImageDecoder.createSource(this.contentResolver,pickedPhoto!!)
                pickedBitmap = ImageDecoder.decodeBitmap(source)
                imageView.setImageBitmap(pickedBitmap)
            }
            else{
                pickedBitmap = MediaStore.Images.Media.getBitmap(this.contentResolver,pickedPhoto)
                imageView.setImageBitmap(pickedBitmap)
            }
        }

        super.onActivityResult(requestCode, resultCode, data)

    }
}