package com.amartadev.androidpemulanaruto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        val actionBar = supportActionBar
        actionBar!!.title = "About"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val imgProfil: ImageView = findViewById(R.id.img_profil)

        val img = "https://d2zvxgfo5lha7k.cloudfront.net/small/avatar/2020012710262624e4b8a6622aec90b643a11f3594c793.png"

        Glide.with(this)
            .load(img)
            .apply(RequestOptions())
            .into(imgProfil)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
