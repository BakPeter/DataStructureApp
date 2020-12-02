package com.bpapps.datastructuresapp.chapters

import android.util.Log
import com.bpapps.datastructuresapp.MainFragment

class Chapters1_5 {
    fun countUniqueValues(arr: Array<Int>): Int {
        var i: Int = 0
        for (j in 1 until arr.size) {
            if (arr[i] != arr[j]) {
                i++
                arr[i] = arr[j]
            }
        }

        return i + 1
    }

    fun frequencyCounterValidAnagram(str1: String, str2: String): Boolean {
        if (str1.length != str2.length) {
            return false
        }

        val str1CharsCounter: MutableMap<Char, Int> = getCharsCount(str1)
        Log.d(MainFragment.TAG, "str1CharsCounter = $str1CharsCounter")
        val str2CharsCounter: MutableMap<Char, Int> = getCharsCount(str2)
        Log.d(MainFragment.TAG, "str2CharsCounter = $str2CharsCounter")

        if (str1CharsCounter.size != str2CharsCounter.size) {
            return false
        }
        str1CharsCounter.forEach { entry ->
            if (str2CharsCounter[entry.key] != entry.value)
                return false
        }

        return true
    }

    fun getCharsCount(str: String): MutableMap<Char, Int> {
        val strCharsCount = mutableMapOf<Char, Int>()
        str.forEach { c: Char ->
            val num = strCharsCount[c]
            if (num == null) {
                strCharsCount[c] = 1
            } else {
                strCharsCount[c] = num + 1
            }
        }

        return strCharsCount
    }
}