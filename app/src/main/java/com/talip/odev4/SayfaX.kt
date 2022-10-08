package com.talip.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.talip.odev4.databinding.FragmentSayfaBBinding
import com.talip.odev4.databinding.FragmentSayfaXBinding


class SayfaX : Fragment() {


    private lateinit var tasarim: FragmentSayfaXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        tasarim = FragmentSayfaXBinding.inflate(inflater, container, false)

        tasarim.buttonXY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.x_y_gecis)
        }

        return tasarim.root


    }
}