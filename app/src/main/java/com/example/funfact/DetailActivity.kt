package com.example.funfact

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.funfact.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    var detailBinding: ActivityDetailBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail)
        val imageResource = intent?.extras?.getInt("logo_resource")
        detailBinding?.apply {
            if (imageResource != null) {
                logoImage.setImageResource(imageResource)
            }
            factTv.text = intent?.extras?.getInt("fact")?.let { getString(it) }
        }

    }

    override fun onDestroy() {

        super.onDestroy()
        detailBinding = null
    }
}