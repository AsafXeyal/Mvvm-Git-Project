package com.asafxeyal.mvvmgitproject.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asafxeyal.mvvmgitproject.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}