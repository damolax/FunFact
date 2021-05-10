package com.example.funfact

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.funfact.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var mainBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainBinding?.factLv?.adapter = FactAdapter(this, DummyData.facts)

    }


    override fun onDestroy() {
        super.onDestroy()
        mainBinding = null
    }
}