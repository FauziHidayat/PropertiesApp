package com.projectku.propertiesapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import com.google.android.material.tabs.TabLayoutMediator
import com.projectku.propertiesapp.R
import com.projectku.propertiesapp.SectionsPagerAdapter
import com.projectku.propertiesapp.databinding.ActivityMenusBinding

class MenusActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenusBinding

    companion object{
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.exterior,
            R.string.interior
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenusBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        binding.viewPager.adapter = sectionsPagerAdapter

        TabLayoutMediator(binding.tabs, binding.viewPager){tab , position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
        supportActionBar?.elevation = 0f


    }
}