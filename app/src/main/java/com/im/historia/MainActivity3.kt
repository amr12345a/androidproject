package com.im.historia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import org.eazegraph.lib.charts.PieChart
import org.eazegraph.lib.models.PieModel


class MainActivity3 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val frag = findViewById<View>(R.id.itemFragment)
        frag.visibility = View.INVISIBLE
        val imageView:ImageView = findViewById(R.id.imageView3)
        val relativeLayout12:RelativeLayout = findViewById(R.id.relativeLayout12)
        val translate =
            AnimationUtils.loadAnimation(applicationContext, R.anim.tanslation)
        imageView.startAnimation(translate)
        relativeLayout12.startAnimation(translate)
    }

    fun action(view: View) {
        val frag = findViewById<View>(R.id.itemFragment)
        val img:ImageView = findViewById(R.id.imageView5);
        if (img.rotation == 0f) {
            frag.visibility = View.VISIBLE
            img.rotation = 90F
            val fadein =
                AnimationUtils.loadAnimation(applicationContext, android.R.anim.fade_in)
            fadein.duration = 1000
            frag.startAnimation(fadein)
        } else if (img.rotation == 90f) {
            frag.visibility = View.INVISIBLE
            img.rotation = 0F
            val fadein =
                AnimationUtils.loadAnimation(applicationContext, android.R.anim.fade_out)
            fadein.duration = 1000
            frag.startAnimation(fadein)
        }
    }

    fun clickit(view: View) {
        val intent: Intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}