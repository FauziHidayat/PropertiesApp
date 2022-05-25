package com.projectku.propertiesapp.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.projectku.propertiesapp.R
import com.projectku.propertiesapp.activity.interior.AlenaInteriorActivity
import com.projectku.propertiesapp.databinding.FragmentInteriorBinding


class InteriorFragment : Fragment(), View.OnClickListener {


    private var _binding: FragmentInteriorBinding? = null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentInteriorBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.cvIntalena.setOnClickListener(this)
        //binding.cvIntalyssa.setOnClickListener(this)
    }


    //onClick
    override fun onClick(p0: View) {
        when(p0.id){
            R.id.cv_intalena -> {
                val intent = Intent(activity, AlenaInteriorActivity::class.java)
                activity?.startActivity(intent)
            }
//            R.id.cv_intalyssa -> {
//                val intent = Intent(activity, AlyssaInteriorActivity::class.java)
//                activity?.startActivity(intent)
            }
        }
    }


