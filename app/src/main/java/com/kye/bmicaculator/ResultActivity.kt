package com.kye.bmicaculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // 메인에서 넘어온 데이터 받기
        val height = intent.getStringExtra("height")!!.toDouble()
        val weight = intent.getStringExtra("weight")!!.toDouble()

        // BMI 계산168
        val bmi = weight / Math.pow(height / 100.0, 2.0)

        // 결과 표시
        when {
            bmi >= 35 -> {
                imageView2.setImageResource(R.drawable.ic_baseline_sick_24)
                textView.text = "고도 비만"
            }
            bmi >= 30 -> {
                imageView2.setImageResource(R.drawable.ic_baseline_sick_24)
                textView.text = "2단계 비만"
            }
            bmi >= 25 -> {
                imageView2.setImageResource(R.drawable.ic_baseline_sick_24)
                textView.text = "1단계 비만"
            }
            bmi >= 23 -> {
                imageView2.setImageResource(R.drawable.ic_baseline_sentiment_very_dissatisfied_24)
                textView.text = "과체중"
            }
            bmi >= 18.5 -> textView.text = "정상"
           else -> {
               imageView2.setImageResource(R.drawable.ic_baseline_sentiment_very_dissatisfied_24)
               textView.text = "저체중"
           }
        }

    }
}