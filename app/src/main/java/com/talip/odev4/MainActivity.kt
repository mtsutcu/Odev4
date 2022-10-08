package com.talip.odev4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.addOnBackStackChangedListener {
            for (i in 0 until supportFragmentManager.backStackEntryCount){
                Log.e("fragments",supportFragmentManager.getBackStackEntryAt(i).name.toString())
            }
        }

    }

    
    override fun onBackPressed() {
        super.onBackPressed()






    }
}