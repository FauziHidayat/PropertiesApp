package com.projectku.propertiesapp.activity.exterior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.projectku.propertiesapp.R
import com.projectku.propertiesapp.fragment.armode.exterior.AlenaExteriorFragment
import com.projectku.propertiesapp.fragment.armode.exterior.AlyssaExteriorFragment
import io.github.sceneview.utils.setFullScreen

class AlyssaExteriorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alyssa_exterior)

        setFullScreen(
            fullScreen = true, hideSystemBars = false,
            fitsSystemWindows = false, rootView = findViewById(R.id.rootViewAlys)
        )

        supportFragmentManager.commit {
            add(R.id.containerFragment, AlyssaExteriorFragment::class.java, Bundle())
        }

    }
}