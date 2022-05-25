package com.projectku.propertiesapp.activity.exterior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.projectku.propertiesapp.R
import com.projectku.propertiesapp.fragment.armode.exterior.AlenaExteriorFragment
import io.github.sceneview.utils.setFullScreen

class AlenaExteriorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alena_exterior)

        setFullScreen(
            fullScreen = true, hideSystemBars = false,
            fitsSystemWindows = false, rootView = findViewById(R.id.rootViewAle)
        )

        supportFragmentManager.commit {
            add(R.id.containerFragment, AlenaExteriorFragment::class.java, Bundle())
        }

    }
}