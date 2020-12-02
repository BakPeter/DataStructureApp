package com.bpapps.datastructuresapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager?.beginTransaction()
            .add(
                R.id.fragment_container_view,
                MainFragment.newInstance("fragment main 1", "fragment main 1"),
                MainFragment.FRAGMENT_TAG
            )
            .commit()
    }
}