package com.amartadev.androidpemulanaruto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val actionBar = supportActionBar
        actionBar!!.title = "Detail Character"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_detail_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_detail)
        val tvSetDescrip: TextView = findViewById(R.id.tv_detail_overview)

        val tvName = intent.getStringExtra(EXTRA_NAME)
        val imgPhoto = intent.getStringExtra(EXTRA_PHOTO)
        val tvDescrip = intent.getStringExtra(EXTRA_DESCRIPTION)

        tvSetName.text = tvName
        Glide.with(this)
            .load(imgPhoto)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetDescrip.text = tvDescrip

    }
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESCRIPTION = "extra_description"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
