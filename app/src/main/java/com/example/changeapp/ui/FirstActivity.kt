package com.example.changeapp.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.changeapp.R
import com.example.fake.presentation.activity.FakeActivity

class FirstActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_activity)
        val intent = Intent(this, FakeActivity::class.java)

//        startActivity(intent)
    }
}