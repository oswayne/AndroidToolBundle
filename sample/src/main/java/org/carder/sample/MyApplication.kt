package org.carder.sample

import android.app.Application

import org.carder.tool.Preferences

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Preferences.initialize(this)
    }

    fun test() {
        Preferences.write("dKey", "dValue")
        println(Preferences.read("dKey","null"))
    }
}
