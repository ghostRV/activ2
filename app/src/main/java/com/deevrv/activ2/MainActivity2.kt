package com.deevrv.activ2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.deevrv.activ2.fragments.Tab1Fragment
import com.deevrv.activ2.fragments.Tab2Fragment
import com.deevrv.activ2.fragments.Tab3Fragment
import com.deevrv.activ2.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : BaseActivity(0) {
    private val TAG = "MainActivity2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(TAG, "onCrate")
        setUpTabs()
        setupBottomNavigation()


    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(Tab1Fragment(), title = "TAB1")
        adapter.addFragment(Tab2Fragment(), title = "TAB2")
        adapter.addFragment(Tab3Fragment(), title = "TAB3")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        tabs.getTabAt(0)!!.setIcon(R.drawable.ic_baseline_tab1)
        tabs.getTabAt(1)!!.setIcon(R.drawable.ic_baseline_tab2)
        tabs.getTabAt(2)!!.setIcon(R.drawable.ic_baseline_tab3)
    }
}
