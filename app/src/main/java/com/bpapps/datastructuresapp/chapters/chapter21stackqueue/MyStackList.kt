package com.bpapps.datastructuresapp.chapters.chapter21stackqueue

import com.bpapps.datastructuresapp.chapters.chapter19singlelinkedlist.SingleLinkedList

class MyStackList<T> {
    private var first: Node<T>? = null
    private var last: Node<T>? = null
    var size: Int = 0
        private set

    fun pop(): T? {
        if (size != 0) {
            var temp = first
            first = first!!.next
            temp!!.next = null

            size--

            return temp.data
        }

        return null
    }

    fun push(data: T): Int {
        val node = Node(data)
        if (size == 0) {
            first = node
            last = node
        } else {
            val temp = first
            node.next = first
            first = node
        }

        size++

        return size
    }

    override fun toString(): String {
        var retVal = StringBuilder("list[[length = ${size}][data : ")
        var node = first
        while (node != null) {
            retVal.append("${node.data}")
            node.next?.let {
                retVal.append(" -> ")
            }

            node = node.next
        }

        retVal.append("]")

        return retVal.toString()
    }


    class Node<T>(var data: T, var next: Node<T>? = null)
}