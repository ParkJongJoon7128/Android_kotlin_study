package com.example.edittextbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { // 액티비티가 최초 실행 되면 이곳을 수행한다.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edittext : EditText = findViewById(R.id.edittext);
        var button : Button = findViewById(R.id.button);
        var textview : TextView = findViewById(R.id.textview);

        button.setOnClickListener{
            var result = edittext.text.toString();
            textview.setText(result);
        }


    }
}