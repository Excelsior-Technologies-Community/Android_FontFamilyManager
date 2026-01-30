# **📚 Android Font Family Manager**


---
A lightweight Android library to apply custom fonts dynamically on TextView, EditText, Button, and custom views — from XML or runtime code, with caching support.

---

## ✨ **Features**

- Apply fonts using XML attributes

- Apply fonts programmatically

- Works with:

  - TextView

  - EditText

  - Button

- Custom Views

- Font caching (better performance)

- No dependency on themes





  ---

# **Preview**
---
<p align="center">
  <img src="https://github.com/S13reya/Android_FontFamilyManager/blob/stages/app/src/main/assets/demovideo.gif" height="320"/>




</p>




## ⚡ **Installation**

**Step 1:** Add JitPack repository to your root build.gradle:

```gradle
maven { url = uri("https://jitpack.io") }
```

**Step 2:** Add the dependency in your app `build.gradle` (example if hosted on JitPack):  

```gradle
dependencies {
	        implementation 'com.github.Excelsior-Technologies-Community:Android_SwipeTransition:1.0.0'

}
```

##     **📥 Adding Fonts**

**1.Create a folder:**

```
res/font/
```

**2.Add .ttf or .otf font files:**


```
roboto.ttf
roboto_bold.ttf

```
## ⚡ **attrs file**
```
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <declare-styleable name="FontTextView">
    <attr name="fontRes" format="reference"/>
</declare-styleable>
</resources>

```

## ⚡ **Usage**


1. Add in XML

```
 <!-- Font for EditText -->
    <com.ext.android_font_family_manager.FontEditText
        android:id="@+id/etInput"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Type here"
        android:layout_marginTop="16dp"/>
    <!-- Font for Button -->
    <com.ext.android_font_family_manager.FontButton
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Custom Font Button"
        android:layout_marginTop="20dp"
        app:fontRes="@font/roboto_bold"/>
      <!-- Font for TextView -->
    <com.ext.android_font_family_manager.FontTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Font from XML"
        android:textSize="22sp"
        app:fontRes="@font/roboto_bold" />
```

## ⚡ **Main Activity**
```
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

```





## **📄 License**

**MIT License**  
```
Copyright (c) 2025 Excelsior Technologies

Permission is hereby granted, free of charge, to any person obtaining a copy  
of this software and associated documentation files (the "Software"), to deal  
in the Software without restriction, including without limitation the rights  
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
copies of the Software, and to permit persons to whom the Software is  
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all  
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED **"AS IS"**, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
```



  
