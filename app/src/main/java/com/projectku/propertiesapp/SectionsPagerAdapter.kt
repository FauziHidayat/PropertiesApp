package com.projectku.propertiesapp

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.projectku.propertiesapp.fragment.ExteriorFragment
import com.projectku.propertiesapp.fragment.InteriorFragment

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position){
            0 -> fragment = ExteriorFragment()
            1 -> fragment = InteriorFragment()
        }
        return fragment as Fragment
    }

}