package com.ext.android_font_family_manager



import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatButton

class FontButton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.buttonStyle
) : AppCompatButton(context, attrs, defStyleAttr) {

    init {
        attrs?.let {
            // Reuse the SAME attribute used by FontTextView
            val ta = context.obtainStyledAttributes(it, R.styleable.FontTextView)
            val fontRes = ta.getResourceId(
                R.styleable.FontTextView_fontRes,
                -1
            )
            if (fontRes != -1) {
                FontManager.apply(this, fontRes)
            }
            ta.recycle()
        }
    }
}
