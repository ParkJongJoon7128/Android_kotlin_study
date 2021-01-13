package com.example.shared

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) { // 해당 액티비티가 처음 실행될 때 한번 수행하는 곳 (초기화)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO: 저장된 데이터를 로드
        loadData() // edit text 저장되어있던 값을 setText
    }

    private fun loadData() {
        var editText: EditText = findViewById(R.id.edittext)

        val pref = getSharedPreferences("pref", 0)
        editText.setText(
            pref.getString(
                "name",
                ""
            )
        ) // 1번째 인자에서는 저장할 당시의 키 값을 적어줌, 2번째는 키 값에 데이터가 존재하지 않을 경우 대체 값을 적어줌.
    }

    private fun saveData() {
        var editText: EditText = findViewById(R.id.edittext)

        val pref = getSharedPreferences("pref", 0)
        val edit = pref.edit() // 수정모드
        edit.putString("name", editText.text.toString()) // 1번째 인자에는 키 값을, 2번째 인자에는 실제 담아둘 값
        edit.apply() // 값을 저장 완료
    }

    override fun onDestroy() { // 해당 액티비티가 종료되는 시점이 다가올 때 호출
        super.onDestroy()

        saveData() // edit text 값을 저장
    }


}