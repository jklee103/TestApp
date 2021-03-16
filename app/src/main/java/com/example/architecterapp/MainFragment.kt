package com.example.architecterapp

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import javax.inject.Inject

class MainFragment : Fragment() {
    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var activityName:String

    @Inject
    lateinit var randomNumber: Integer

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(activity is MainActivity){
            (activity as MainActivity).getComponent()
                .mainFragmentComponentBuilder()
                .setModule(MainFragmentModule())
                .setFragment(this)
                .build()
                .inject(this)
        }
        Log.e("mainfragment",activityName)
        Log.e("mainfragment", "random num = $randomNumber")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

}