package com.deevrv.activ2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_three.*

class ThreeThreeActivity : BaseActivity(2) {
    private val TAG = "ThreeThreeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_three)
        Log.d(TAG, "OnCrate")
        setupBottomNavigation()
        }
    }
