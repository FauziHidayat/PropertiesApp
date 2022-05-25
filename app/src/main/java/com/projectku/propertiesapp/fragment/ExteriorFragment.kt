package com.projectku.propertiesapp.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projectku.propertiesapp.R
import com.projectku.propertiesapp.activity.exterior.AlenaExteriorActivity
import com.projectku.propertiesapp.activity.exterior.AlyssaExteriorActivity
import com.projectku.propertiesapp.activity.interior.AlenaInteriorActivity
import com.projectku.propertiesapp.databinding.FragmentExteriorBinding
import com.projectku.propertiesapp.databinding.FragmentInteriorBinding

class ExteriorFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentExteriorBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentExteriorBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.cvExalena.setOnClickListener(this)
        binding.cvExalyssa.setOnClickListener(this)

    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.cv_exalyssa -> {
                val intent = Intent(activity, AlyssaExteriorActivity::class.java)
                activity?.startActivity(intent)
            }
            R.id.cv_exalena -> {
                val intent = Intent(activity, AlenaExteriorActivity::class.java)
                activity?.startActivity(intent)
            }
        }
    }


}