package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageview : ImageView = findViewById(R.id.android)
        var button : ImageButton = findViewById(R.id.button)

        button.setOnClickListener{
            imageview.setImageResource(R.drawable.robot) // 이미지 뷰에 새로운 이미지 등록
            Toast.makeText(this@MainActivity, "버튼이 클릭 되었습니다.", Toast.LENGTH_SHORT).show()
        }
    }
}