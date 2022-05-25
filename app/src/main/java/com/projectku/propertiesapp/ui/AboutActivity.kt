package com.projectku.propertiesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projectku.propertiesapp.R
import com.projectku.propertiesapp.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnBack.setOnClickListener {
            onBackPressed()
        }



    }
}