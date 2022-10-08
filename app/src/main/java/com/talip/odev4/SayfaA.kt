package com.talip.odev4

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.talip.odev4.databinding.FragmentAnasayfaBinding
import com.talip.odev4.databinding.FragmentSayfaABinding


class SayfaA : Fragment() {

    private lateinit var tasarim: FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        tasarim = FragmentSayfaABinding.inflate(inflater, container, false)





        tasarim.buttonB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.a_b_gecis)


        }

        return tasarim.root


    }

}