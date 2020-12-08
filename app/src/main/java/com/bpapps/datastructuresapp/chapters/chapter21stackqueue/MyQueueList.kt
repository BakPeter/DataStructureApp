package com.bpapps.datastructuresapp.chapters.chapter21stackqueue

import com.bpapps.datastructuresapp.chapters.chapter19singlelinkedlist.SingleLinkedList
import com.bpapps.datastructuresapp.chapters.chapter22binarysearchtrees.BinarySearchTree

class MyQueueList<T> {

    private var first: Node<T>? = null
    private var last: Node<T>? = null
    var size: Int = 0
        private set

    fun deQueue(): Node<T>? {
        return when (size) {
            0 -> null

            1 -> {
                val retVal = first
                first = null
                last = null

                size--

                retVal
            }

            else -> {
                val node = first
                first = first!!.next
                node!!.next = null

                size--

                node
            }
        }
    }

    fun endQueue(data: T): Int {
        val node = Node(data)

        if (size == 0) {
            first = node
            last = node
        } else {
            last!!.next = node
            last = node
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