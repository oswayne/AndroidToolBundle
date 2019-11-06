package org.oswayne.tool

import android.content.Context

import com.tencent.mmkv.MMKV

object Preferences {

    private var PREFERENCE: MMKV? = null

    fun initialize(context: Context): String {
        val rootPath = MMKV.initialize(context)
        PREFERENCE = MMKV.defaultMMKV()
        return rootPath
    }

    fun write(key: String, value: Boolean) {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        PREFERENCE!!.encode(key, value)
    }

    fun write(key: String, value: Int) {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        PREFERENCE!!.encode(key, value)
    }

    fun write(key: String, value: Float) {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        PREFERENCE!!.encode(key, value)
    }

    fun write(key: String, value: Long) {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        PREFERENCE!!.encode(key, value)
    }

    fun write(key: String, value: Double) {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        PREFERENCE!!.encode(key, value)
    }

    fun write(key: String, value: ByteArray) {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        PREFERENCE!!.encode(key, value)
    }

    fun write(key: String, value: String) {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        PREFERENCE!!.encode(key, value)
    }

    fun write(key: String, value: Set<String>) {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        PREFERENCE!!.encode(key, value)
    }

    fun read(key: String, defValue: Boolean): Boolean {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        return PREFERENCE!!.decodeBool(key, defValue)
    }

    fun read(key: String, defValue: Int): Int {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        return PREFERENCE!!.decodeInt(key, defValue)
    }

    fun read(key: String, defValue: Float): Float {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        return PREFERENCE!!.decodeFloat(key, defValue)
    }

    fun read(key: String, defValue: Long): Long {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        return PREFERENCE!!.decodeLong(key, defValue)
    }

    fun read(key: String, defValue: ByteArray): ByteArray {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        return PREFERENCE!!.decodeBytes(key, defValue)
    }

    fun read(key: String, defValue: String): String {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        return PREFERENCE!!.decodeString(key, defValue)
    }

    fun read(key: String, defValue: Set<String>): Set<String> {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        return PREFERENCE!!.decodeStringSet(key, defValue)
    }

    fun check(key: String): Boolean {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        return PREFERENCE!!.containsKey(key)
    }

    fun erase(key: String) {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        PREFERENCE!!.removeValueForKey(key)
    }

    fun erase(keys: Array<String>) {
        checkNotNull(PREFERENCE) { "Please call init() first" }
        PREFERENCE!!.removeValuesForKeys(keys)
    }
}
