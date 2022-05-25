package com.projectku.propertiesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projectku.propertiesapp.R
import com.projectku.propertiesapp.databinding.ActivityGuideBinding

class GuideActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGuideBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuideBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBack.setOnClickListener {
            onBackPressed()
        }


    }
}