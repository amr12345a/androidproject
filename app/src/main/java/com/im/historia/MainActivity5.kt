package com.im.historia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ProgressBar
import android.widget.RelativeLayout

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val anim =
            AnimationUtils.loadAnimation(applicationContext, R.anim.anim1)
        val relativeLayout:RelativeLayout = findViewById(R.id.relativeLayout)
        relativeLayout.startAnimation(anim)
        val relativeLayout1:RelativeLayout = findViewById(R.id.relativeLayout1)
        relativeLayout1.startAnimation(anim)
        val relativeLayout2:RelativeLayout = findViewById(R.id.relativeLayout2)
        relativeLayout2.startAnimation(anim)
        val relativeLayout3:RelativeLayout = findViewById(R.id.relativeLayout3)
        relativeLayout3.startAnimation(anim)
        val relativeLayout4:RelativeLayout = findViewById(R.id.relativeLayout4)
        relativeLayout4.startAnimation(anim)
        val relativeLayout5:RelativeLayout = findViewById(R.id.relativeLayout5)
        relativeLayout5.startAnimation(anim)
    }
}