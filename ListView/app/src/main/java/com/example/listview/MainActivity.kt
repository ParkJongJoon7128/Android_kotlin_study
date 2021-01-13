package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "안드로이드", "22", "안녕하세요"),
        User(R.drawable.android, "자바", "22", "안녕하세요"),
        User(R.drawable.android, "스위프트", "22", "안녕하세요"),
        User(R.drawable.android, "자바스크립트", "22", "안녕하세요"),
        User(R.drawable.android, "리액트", "22", "안녕하세요"),
        User(R.drawable.android, "코틀린", "22", "안녕하세요"),
        User(R.drawable.android, "파이썬", "22", "안녕하세요")
    )

    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티의 시작 지점
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview: ListView = findViewById(R.id.listview)

//        val item = arrayOf("사과", "배", "딸기", "키위", "바나나")
//
//        //context란 한 액티비티의 모든 정보를 담고있다.
//        listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        val Adapter = UserAdapter(this, UserList)
        listview.adapter = Adapter

        listview.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->
                val selectItem = parent.getItemAtPosition(position) as User
                Toast.makeText(
                    this,
                    selectItem.name + ", " + selectItem.age + ", " + selectItem.greet,
                    Toast.LENGTH_SHORT
                ).show()
            }

    }
}