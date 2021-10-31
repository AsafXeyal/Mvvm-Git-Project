package com.asafxeyal.mvvmgitproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NumbersOfOddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_numbers_of_odd)


    }

    private fun vurmaEmeli() : Int {

        return 5 * 3
    }

    private fun bolmeEmeli() : Int {

        return 5 / 3
    }
}