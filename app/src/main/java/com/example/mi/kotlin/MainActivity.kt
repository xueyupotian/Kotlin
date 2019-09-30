package com.example.mi.kotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "你好，北京"

        textView.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("isNormal", true)
            //intent.setFlag(Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }

    }

}
