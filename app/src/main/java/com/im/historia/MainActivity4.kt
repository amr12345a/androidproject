package com.im.historia

import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.RadioButton
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.popup.view.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val m_one:RadioButton = findViewById(R.id.radioButton)
        val m_two = findViewById<RadioButton>(R.id.radioButton2)
        val m_three = findViewById<RadioButton>(R.id.radioButton3)
        val m_four = findViewById<RadioButton>(R.id.radioButton4)

        m_one.setOnClickListener {
                m_one.isChecked = true
                m_two.isChecked = false
                m_three.isChecked = false
                m_four.isChecked = false
        }

        m_two.setOnClickListener {
                m_one.isChecked = false
                m_two.isChecked = true
                m_three.isChecked = false
                m_four.isChecked = false
        }

        m_three.setOnClickListener {
            m_one.isChecked = false
            m_two.isChecked = false
            m_three.isChecked = true
            m_four.isChecked = false
        }

        m_four.setOnClickListener {
            m_one.isChecked = false
            m_two.isChecked = false
            m_three.isChecked = false
            m_four.isChecked = true
        }




        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            val DialogView = LayoutInflater.from(this).inflate(R.layout.popup, null)

            val BuilderView = AlertDialog.Builder(this).setView(DialogView)

            val alredDialog = BuilderView.show()
            alredDialog.window?.decorView?.setBackgroundResource(android.R.color.transparent)
            DialogView.button.setOnClickListener {

                alredDialog.dismiss()
            }
        }
    }

    fun clickit(view: View) {
        val intent: Intent = Intent(this,MainActivity5::class.java)
        startActivity(intent)
    }


}
