package com.deevrv.activ2


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_two.*

class TwoActivity : BaseActivity(1) {
    private val TAG = "TwoActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        setupBottomNavigation()
        Log.d(TAG, "onCreate")

        bt2_1.setOnClickListener {
            val i = Intent(this, twoOneActivity::class.java)
            startActivity(i)
        }
        setSupportActionBar(toolbar)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.over_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_settings ->
                Toast.makeText(this, "Поиск активирован", Toast.LENGTH_SHORT).show()

            R.id.action_settings2 ->
                Toast.makeText(this, "меню", Toast.LENGTH_SHORT).show()
            }
            return super.onOptionsItemSelected(item)

    }

}
