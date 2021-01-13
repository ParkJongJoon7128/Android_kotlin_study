package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var layout_drawer: DrawerLayout = findViewById(R.id.layout_drawer)
        var navView: NavigationView = findViewById(R.id.navView)
        var btn_nav: ImageView = findViewById(R.id.btn_nav)


        btn_nav.setOnClickListener {
            layout_drawer.openDrawer(GravityCompat.START) // START = LEFT, END = RIGHT와 같은 말
        }

        navView.setNavigationItemSelectedListener(this) // 네비게이션 메뉴 아이템에 클릭 속성 부여

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean { // 네비게이션 메뉴 아이템 클릭 시 수행행

        var layout_drawer: DrawerLayout = findViewById(R.id.layout_drawer)

        when (item.itemId) {
            R.id.access -> Toast.makeText(applicationContext, "접근성", Toast.LENGTH_SHORT).show()
            R.id.email -> Toast.makeText(applicationContext, "이메일", Toast.LENGTH_SHORT).show()
            R.id.message -> Toast.makeText(applicationContext, "메세지", Toast.LENGTH_SHORT).show()
        }
        layout_drawer.closeDrawers() // 네비게이션 뷰 닫기
        return false
    }

    override fun onBackPressed() {
        var layout_drawer: DrawerLayout = findViewById(R.id.layout_drawer)

        if (layout_drawer.isDrawerOpen(GravityCompat.START)) {
            layout_drawer.closeDrawers()
        } else {
            super.onBackPressed() // 일반 Back 버튼 기능 실행
        }
    }
}