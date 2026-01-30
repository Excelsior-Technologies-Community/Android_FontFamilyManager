package com.ext.android_font_family_manager

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class FontTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    init {
        attrs?.let {
            val ta = context.obtainStyledAttributes(it, R.styleable.FontTextView)
            val fontRes = ta.getResourceId(
                R.styleable.FontTextView_fontRes, -1
            )
            if (fontRes != -1) {
                FontManager.apply(this, fontRes)
            }
            ta.recycle()
        }
    }
}
