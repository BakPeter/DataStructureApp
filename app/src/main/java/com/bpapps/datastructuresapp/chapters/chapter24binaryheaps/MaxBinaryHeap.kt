package com.bpapps.datastructuresapp.chapters.chapter24binaryheaps

class MaxBinaryHeap<T : Comparable<T>> {

    var data = arrayListOf<T>()

    fun insert(value: T): ArrayList<T> {
        data.add(value)

        var ind = data.size - 1
        val element = data[ind]
        var parentInd: Int = (ind - 1) / 2
        var parentElement: T
        while (ind > 0) {
            parentElement = data[parentInd]
            if (element >= parentElement) {
                val temp = data[parentInd]
                data[parentInd] = data[ind]
                data[ind] = temp
                parentInd = (ind - 1) / 2
                ind = parentInd
            } else {
                break
            }
        }

        return data
    }
}