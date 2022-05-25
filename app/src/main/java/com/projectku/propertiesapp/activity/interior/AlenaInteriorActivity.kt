package com.projectku.propertiesapp.activity.interior

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.projectku.propertiesapp.R
import com.projectku.propertiesapp.fragment.armode.interior.AlenaInteriorFragment
import io.github.sceneview.utils.setFullScreen

class AlenaInteriorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alena_interior)


        setFullScreen(
            fullScreen = true, hideSystemBars = false,
            fitsSystemWindows = false, rootView = findViewById(R.id.rootView)
        )

        supportFragmentManager.commit {
            add(R.id.containerFragment, AlenaInteriorFragment::class.java, Bundle())
        }

    }
}