package com.bpapps.datastructuresapp.chapters

class Chapter10 {

    companion object {
        fun stringSearch(str1: String, str2: String): Boolean {
            if (str1 == "") return false

            var str2Ind = 0
            str1.forEach { c ->
                if (c == str2[str2Ind]) {
                    str2Ind += 1
                } else {
                    str2Ind = 0
                }

                if (str2Ind == str2.length - 1) return true
            }

            return false
        }
    }
}