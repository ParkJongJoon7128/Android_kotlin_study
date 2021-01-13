package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_fragment1.setOnClickListener{
            setFrag(0)
        }

        btn_fragment2.setOnClickListener {
            setFrag(1)
        }

        btn_fragment3.setOnClickListener {
            setFrag(2)
        }

    }

    private fun setFrag(fragNum: Int) {
        val ft = supportFragmentManager.beginTransaction()
        when (fragNum) { // when은 Java의 Switch() 구문과 같다.
            0 -> {
                ft.replace(R.id.main_frame, Fragment1()).commit()
            }
            1 -> {
                ft.replace(R.id.main_frame, Fragment2()).commit()
            }
            2 -> {
                ft.replace(R.id.main_frame, Fragment3()).commit()
            }
        }
    }
}