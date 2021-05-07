package com.kye.bmicaculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultButton.setOnClickListener {

            // 액티비티 이동하기 위해서는 mainActivity에서 secondActivity로 이동하는 Intent를 만든다.
            // 도착하는 액티비티를 입력할 때에는 activity 혹은 activity.class가 아니라,
            // activity::class.java 형식으로 입력한다.
            val intent = Intent(this, ResultActivity::class.java)

            // 데이터를 넘기기 위한 셋팅
            intent.putExtra("height", editText1.text.toString())
            intent.putExtra("weight", editText2.text.toString())

            println("${editText1.text.toString()} : ${editText2.text.toString()}")

            startActivity(intent)

        }


    }
}