package com.deevrv.activ2


import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_three.*

class ThreeActivity : BaseActivity(2) {
    private val TAG = "ThreeActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)

        setupBottomNavigation()
        Log.d(TAG, "onCreate")
        button2.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)

        }
        button3.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
            bt_button33.setOnClickListener {
                val i = Intent(this, ThreeThreeActivity::class.java)
                startActivity(i)
            }
        }
    }
