package com.agm91.tmapp.util

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build

object Utils {
    @JvmStatic
    fun isWatch(context: Context): Boolean {
        return if (Build.VERSION.SDK_INT < Build.VERSION_CODES.KITKAT_WATCH) {
            false
        } else {
            context.packageManager.hasSystemFeature(PackageManager.FEATURE_WATCH)
        }
    }
}