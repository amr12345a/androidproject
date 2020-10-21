package com.im.historia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val img:ImageView = findViewById(R.id.imageView2)
        val text:TextView = findViewById(R.id.textView)
        val imageView:ImageView = findViewById(R.id.imageView)
        val fadein =
            AnimationUtils.loadAnimation(applicationContext, android.R.anim.fade_in)
        fadein.duration = 700
        img.startAnimation(fadein)
        fadein.duration = 1200
        imageView.startAnimation(fadein)
        text.startAnimation(fadein)

    }

    fun click(view: View) {
        val intent:Intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }


}