package com.deevrv.activ2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.gms.ads.*
import kotlinx.android.synthetic.main.activity_two_one.*

class twoOneActivity : BaseActivity(1) {
    private val TAG = "twoOneActivity"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_one)
        Log.d(TAG, "onCreate")
        setupBottomNavigation()
        setSupportActionBar(toolbar)




    }

}
//private fun bannerAd(){
//        mAdView = findViewById(R.id.adView)
//        val adRequest = AdRequest.Builder().build()
//        mAdView.loadAd(adRequest)
//
//        mAdView.adListener = object : AdListener(){
//
//            override fun onAdLoaded() {
//               Log.d(TAG, "Ad loaded")
//            }
//
//            override fun onAdFailedToLoad(p0: LoadAdError?) {
//                Log.d(TAG,"Ad failed to load")
//            }
//
//            override fun onAdOpened() {
//                Log.d(TAG,"Ad opened")
//            }
//
//            override fun onAdClicked() {
//                Log.d(TAG,"Ad clicked")
//
//            }
//
//            override fun onAdLeftApplication() {
//                Log.d(TAG,"User left app on ad")
//            }
//
//            override fun onAdClosed() {
//                Log.d(TAG,"Ad closed")
//            }
//        }
//
//    }