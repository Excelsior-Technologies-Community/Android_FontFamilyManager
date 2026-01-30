package com.ext.android_font_family_manager

import android.widget.TextView

object FontManager {

    fun apply(view: TextView, fontRes: Int) {
        view.typeface = FontCache.get(view.context, fontRes)
        view.invalidate()
        view.requestLayout()
    }
}
