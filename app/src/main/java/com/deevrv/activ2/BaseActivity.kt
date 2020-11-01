package com.deevrv.activ2

import android.content.Intent
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_navigation_viw.*

abstract class BaseActivity(val navNumber: Int) : AppCompatActivity (){
    private val TAG = "BaseActivity"
    fun setupBottomNavigation () {
        bottom_navigation_view.setOnNavigationItemSelectedListener {
            val nextActivity =
                when(it.itemId) {
                    R.id.item1 -> MainActivity::class.java
                    R.id.item2 -> TwoActivity::class.java
                    R.id.item3 -> ThreeActivity::class.java
                    else -> {
                        Log.e(TAG, "unknown nav item clicked $it")
                        null
                    }
                }
            if (nextActivity != null){
                val intent = Intent (this, nextActivity)
                intent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
                startActivity(intent)
                overridePendingTransition(0,0)
                true
            }else {
                false
            }
        }
        bottom_navigation_view.menu.getItem(navNumber). isChecked = true
    }
}