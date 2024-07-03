package com.neppplus.pizzaorderapp

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity{
    // 추상클래스

    val mContext = this


    abstract fun setupEvents()
    abstract fun setValues()
}