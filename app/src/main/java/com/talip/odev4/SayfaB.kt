package com.talip.odev4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation
import com.talip.odev4.databinding.FragmentSayfaBBinding


class SayfaB : Fragment() {


    private lateinit var tasarim: FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)


        tasarim.buttonBY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.b_y_gecis)






        
        }





        

        return tasarim.root


    }

}