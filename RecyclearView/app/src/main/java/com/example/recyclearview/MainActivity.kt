package com.example.recyclearview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.boy, "제이로이드", 22, "안드로이드 앱 개발자"),
            Profiles(R.drawable.girl, "박이로이드", 22, "안드로이드 앱 개발자"),
            Profiles(R.drawable.boy, "김이로이드", 22, "안드로이드 앱 개발자"),
            Profiles(R.drawable.girl, "이이로이드", 22, "안드로이드 앱 개발자"),
            Profiles(R.drawable.boy, "정이로이드", 22, "안드로이드 앱 개발자"),
            Profiles(R.drawable.girl, "키키로이드", 22, "안드로이드 앱 개발자"),
            Profiles(R.drawable.boy, "아하로이드", 22, "안드로이드 앱 개발자"),
            Profiles(R.drawable.girl, "가나로이드", 22, "안드로이드 앱 개발자")
        )

        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_profile.setHasFixedSize(true)

        rv_profile.adapter = ProfileAdapter(profileList)

    }
}