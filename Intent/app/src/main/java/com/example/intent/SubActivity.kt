package com.example.intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        if(intent.hasExtra("msg")){
            var textview : TextView = findViewById(R.id.textview)
            textview.text = intent.getStringExtra("msg") // 서브 액티비티의 존재하는 텍스트뷰에다가 안녕하세요 박종준입니다 가 넘겨져 옴
        }
    }
}