package com.example.myuidesign

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val toggle = findViewById<SwitchCompat>(R.id.switch2)
// add event listener to the switch botton
        toggle.setOnClickListener {
            //check if button is checked or not
            if (toggle.isChecked){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES) //if checked switch to night mode
            }else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)//if unchecked switch to light mode
            }
        }
    }
}