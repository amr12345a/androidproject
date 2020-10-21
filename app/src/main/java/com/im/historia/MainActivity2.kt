package com.im.historia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun ck(view: View) {
        val intent:Intent = Intent(this,MainActivity3::class.java)
        startActivity(intent)
    }

    fun cc(view: View) {
        val intent:Intent = Intent(this,MainActivity4::class.java)
        startActivity(intent)
    }
}