package com.bpapps.datastructuresapp.chapters.chapter20doublylinkedlist

import android.util.Log

class DoublyLinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    var length: Int = 0
        private set

    fun reverse(): DoublyLinkedList<T> {
        if (head != null) {
            var curr = head
            head = tail
            tail = curr

            var next: Node<T>? = null
            var prev: Node<T>? = null
            if (length > 1) {
                while (curr != null) {
                    next = curr.next
                    prev = curr!!.prev
                    curr.prev = curr.next
                    curr.next = prev

                    curr = next
                }
            }
        }

        return this
    }

    fun remove(ind: Int): T? {
        if (ind < 0 || ind > length - 1) return null
        if (ind == 0) return popFromHead()
        if (ind == length - 1) return popFromTail()

        val nodeToRemove = getNode(ind)

        Log.d(TAG, nodeToRemove.toString())

        val prev = nodeToRemove!!.prev
        val next = nodeToRemove.next
        prev!!.next = next
        next!!.prev = prev
//        nodeToRemove!!.prev = nodeToRemove.next
//        nodeToRemove.next!!.prev = nodeToRemove.prev

        length--

        return nodeToRemove.data
    }

    fun insert(ind: Int, data: T): Boolean {
        if (ind < 0 || ind > length - 1) return false
        if (ind == 0) {
            pushToHead(data)
            return true
        }
        if (ind == length - 1) {
            pushToTail(data)
            return true
        }

        val prevNode = getNode(ind - 1)
        val newNode = Node(data, prevNode, prevNode!!.next)
        prevNode.next = newNode
        newNode.next!!.prev = newNode

        length++

        return true
    }

    fun set(ind: Int, data: T): T? {
        val node = getNode(ind)

        return if (node != null) {
            node.data = data
            node.data
        } else {
            null
        }
    }

    fun get(ind: Int): T? {
        return getNode(ind)?.data
    }

    private fun getNode(ind: Int): Node<T>? {
        if (ind < 0 || ind > length - 1) {
            return null
        } else {
            var node: Node<T>? = null
            var counter = 0

            if (ind < (length / 2)) {
                //from beginning
                node = head

                while (counter != ind) {
                    node = node!!.next
                    counter++
                }
            } else {
                //from the end
                node = tail

                counter = length - 1
                while (counter != ind) {
                    node = node!!.prev
                    counter--
                }
            }
            return node
        }
    }

    //unShift
    fun pushToHead(data: T): DoublyLinkedList<T> {
        val node = Node(data)

        if (head == null) {
            head = node
            tail = node
        } else {
            node.next = head
            head!!.prev = node
            head = node
        }

        length++
        return this
    }


    //shift
    fun popFromHead(): T? {
        if (head == null) return null

        val node = head
        if (length == 1) {
            head = null
            tail = null
        } else {
            head = node!!.next
            head!!.prev = null
            node.next = null
        }

        length--

        return node!!.data
    }

    //pop
    fun popFromTail(): T? {
        if (head == null) return null

        val node = tail
        if (length == 1) {
            head = null
            tail = null
        } else {
            tail = node!!.prev
            tail!!.next = null
            node.prev = null
        }

        length--

        return node!!.data
    }

    //push
    fun pushToTail(data: T): DoublyLinkedList<T> {
        var node = Node<T>(data)
        if (length == 0) {
            head = node
            tail = node
        } else {
            tail!!.next = node
            node.prev = tail
            tail = node
        }

        length++
        return this
    }

    override fun toString(): String {
        var retVal = StringBuilder("$length : ")
        var node = head

        while (node != null) {
            retVal.append(node.data)
            node.next?.let {
                retVal.append(" <-> ")
            }
            node = node.next
        }

        return retVal.toString()
    }


    companion object {
        private const val TAG = "TAG.DoublyLinkedList"
    }

    data class Node<T>(var data: T, var prev: Node<T>? = null, var next: Node<T>? = null) {
        override fun toString(): String {
            return "Node[data=${data}, prev=${prev?.data}, next=${next?.data} ]"
        }
    }
}