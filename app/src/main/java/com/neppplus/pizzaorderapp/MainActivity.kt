package com.neppplus.pizzaorderapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupEvents()
        setValues()
    }
    override fun setupEvents() {
        // 버튼 클릭등의 이벤트 관련 코드 모음
    }

    override fun setValues() {
        // 화면에 데이터를 표시하기 위한 코드 모음
        val mainTabLayout = findViewById<com.google.android.material.tabs.TabLayout>(R.id.mainTabLayout)
//        mainTabLayout.setupWithViewPager()
    }

}