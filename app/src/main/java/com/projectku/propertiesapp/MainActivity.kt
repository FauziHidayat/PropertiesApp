package com.projectku.propertiesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.projectku.propertiesapp.ui.MenusActivity
import com.projectku.propertiesapp.databinding.ActivityMainBinding
import com.projectku.propertiesapp.ui.AboutActivity
import com.projectku.propertiesapp.ui.GuideActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnStart.setOnClickListener {
            val intent = Intent(this, MenusActivity::class.java)
            startActivity(intent)
        }

        binding.btnGuide.setOnClickListener {
            val intentGuide = Intent(this, GuideActivity::class.java)
            startActivity(intentGuide)
        }

        binding.btnAbout.setOnClickListener {
            val intentAbout = Intent(this, AboutActivity::class.java)
            startActivity(intentAbout)
        }

    }
}