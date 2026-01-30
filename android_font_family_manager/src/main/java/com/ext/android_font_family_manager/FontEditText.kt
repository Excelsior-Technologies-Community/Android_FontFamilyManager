package com.ext.android_font_family_manager



import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class FontEditText @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = android.R.attr.editTextStyle
) : AppCompatEditText(context, attrs, defStyleAttr) {

    init {
        attrs?.let {
            // Load custom attributes
            val ta = context.obtainStyledAttributes(it, R.styleable.FontTextView)
            val fontRes = ta.getResourceId(R.styleable.FontTextView_fontRes, -1)
            if (fontRes != -1) {
                FontManager.apply(this, fontRes)
            }
            ta.recycle()
        }
    }
}
