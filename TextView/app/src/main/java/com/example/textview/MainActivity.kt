package com.example.textview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // 앱이 최초 실행했을 때 수행.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // xml 화면 뷰를 연결한다.

        val text : TextView = findViewById(R.id.textview); // xml 에서 TextView 뷰에 설정한 id값을 가져와 연결한다.
        text.setText("Hello World 박종준!"); // 텍스트 값을 변경한다.
    }
}