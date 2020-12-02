package com.bpapps.datastructuresapp.chapters

import kotlin.math.absoluteValue

class Chapter6 {
    companion object {
        fun maxSubArraySum(arr: Array<Int>, size: Int): Int? {
            if (size > arr.size) return null

            var maxSum: Int = 0

            for (i in 0 until size) {
                maxSum += arr[i]
            }

            var currSum = maxSum
            //0 1 2  3  4 5 6 7  8 | 9
            //1 4 2 10 23 3 1 0 20 | 4
            for (i in 0 until arr.size - size) {
                currSum = currSum - arr[i] + arr[i + size]

                if (currSum > maxSum) maxSum = currSum
            }

            return maxSum
        }

        fun isSubSequence(sequence: String, str: String): Boolean {
            var seqInd = 0

            str.forEach { c: Char ->
                if (c == sequence[seqInd]) {
                    seqInd++

                    if (seqInd == sequence.length) {
                        return true
                    }
                }
            }

            return false
        }

        fun averagePair(arr: Array<Int>, avg: Double): Boolean {
            var indStart = 0
            var indEnd = arr.size - 1
            var currAvg: Double

            while (indStart < indEnd) {
                currAvg = (arr[indStart].toDouble() + arr[indEnd]) / 2
                when {
                    currAvg > avg -> indEnd--
                    currAvg < avg -> indStart++
                    else -> return true
                }
            }

            return false
        }

        fun areThereDuplicatesInSortedArr(arr: Array<Int>): Boolean {
            var ind = 0

            for (i in 1 until arr.size - 1) {
                if (arr[ind] != arr[i]) {
                    ind++
                } else {
                    return true
                }
            }

            return false
        }

        fun areThereDuplicates(arr: Array<Int>): Boolean {
            val flags: MutableSet<Int> = mutableSetOf()

            arr.forEach { num: Int ->
                if (flags.contains(num)) {
                    return true
                } else {
                    flags.add(num)
                }
            }

            return false
        }

        fun digitsFrequencyCounter(n1: Int, n2: Int): Boolean {
            val n1NumberOfDigits: UInt = getNumberOfDigits(n1)
            val n2NumberOfDigits: UInt = getNumberOfDigits(n2)

            return n1NumberOfDigits == n2NumberOfDigits
        }

        private fun getNumberOfDigits(n1: Int): UInt {
            var numberOfDigits: UInt = 0U

            if (n1 == 0) return 0U

            var num = if (n1 > 0) n1 else n1 * (-1)
            while (num > 0) {
                numberOfDigits++
                num /= 10
            }

            return numberOfDigits
        }
    }
}