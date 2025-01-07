package com.zhouguan.toastfree

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.zhouguan.toastfree.base.ToastFree

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val toast = ToastFree.instance()
        toast.showTextLong(this, "Toast show!!!")
    }
}