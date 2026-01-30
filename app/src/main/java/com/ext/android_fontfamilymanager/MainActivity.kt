package com.ext.android_fontfamilymanager

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.ext.android_font_family_manager.FontManager

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNormal = findViewById<TextView>(R.id.tvNormal)
        val etInput = findViewById<EditText>(R.id.etInput)
        val btnChange = findViewById<Button>(R.id.btnChange)

        // 🔹 Default fonts
//        FontManager.apply(tvNormal, R.font.roboto)
//        FontManager.apply(etInput, R.font.roboto)
//        FontManager.apply(btnChange, R.font.roboto_bold)

        var isBoldApplied = false

        // 🔹 When user types → reset to normal font
        etInput.addTextChangedListener {
            if (isBoldApplied) {
                FontManager.apply(etInput, R.font.roboto)
                isBoldApplied = false
            }
        }

        // 🔹 Button click → apply bold font
        btnChange.setOnClickListener {
            FontManager.apply(etInput, R.font.roboto_bold)
            isBoldApplied = true
        }
    }
}
