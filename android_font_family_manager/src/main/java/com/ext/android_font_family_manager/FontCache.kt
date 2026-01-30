package com.ext.android_font_family_manager

import android.content.Context
import android.graphics.Typeface
import androidx.core.content.res.ResourcesCompat

object FontCache {

    private val cache = HashMap<Int, Typeface>()

    fun get(context: Context, fontRes: Int): Typeface {
        return cache[fontRes] ?: ResourcesCompat.getFont(context, fontRes)!!.also {
            cache[fontRes] = it
        }
    }

    fun clear() {
        cache.clear()
    }
}
