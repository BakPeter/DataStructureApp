package com.bpapps.datastructuresapp.chapters.chapter19singlelinkedlist

import java.lang.StringBuilder

class SingleLinkedList<T> {

    var head: Node<T>? = null
        private set

    var tail: Node<T>? = null
        private set

    var length: Int = 0
        private set

    fun reverse(): SingleLinkedList<T> {
        var curr = head
        head = tail
        tail = curr

        var next: Node<T>?
        var prev: Node<T>? = null
        while(curr != null) {
            next = curr.next
            curr.next = prev
            prev = curr
            curr = next
        }

//        if (!(length == 0 || length == 1)) {
//            var currNode = head
//
//            while (currNode != null) {
//                head = currNode.next
//                tail!!.next = currNode
//                tail = currNode
//                currNode.next = null
//
//                currNode = currNode.next
//            }
//        }
        return this
    }

    fun remove(ind: Int): Boolean {
        if (ind < 0 || ind > length - 1) return false
        if (ind == 0) {
            popFromHead()
            return true
        }
        if (ind == length - 1) {
            popFromTail()
            return true
        }

        val prevNode = getNode(ind - 1)
        val nodeToRemove = prevNode!!.next
        prevNode.next = nodeToRemove!!.next
        length--

        return true
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
        val nodeToAdd = Node(data, prevNode?.next)
        prevNode!!.next = nodeToAdd
        length++

        return true
    }

    fun set(ind: Int, data: T): SingleLinkedList<T> {
        var node = head
        var counter = 0

        searchIndLoop@ while (node != null) {
            if (counter == ind) {
                node.data = data
                break@searchIndLoop
            } else {
                counter++
                node = node.next
            }
        }

        return this
    }

    fun get(ind: Int): T? {
        return getNode(ind)?.data
//        var node = head
//        var counter = 0
//
//        while (node != null) {
//            if (counter == ind) {
//                return node.data
//            } else {
//                counter++
//                node = node.next
//            }
//        }
//
//        return null
    }

    private fun getNode(ind: Int): Node<T>? {
        var node = head
        var counter = 0

        while (node != null) {
            if (counter == ind) {
                return node
            } else {
                counter++
                node = node.next
            }
        }

        return null
    }

    fun popFromHead(): Node<T>? {
        val node: Node<T>? = head

        val retVal = when {
            node == null -> node
            node.next == null -> {
                head = null
                node
            }
            else -> {
                head = head!!.next
                node
            }
        }

        length--
        if (length <= 0) {
            length = 0
            head = null
            tail = null
        }

        return retVal
    }

    fun popFromTail(): Node<T>? {
        return head?.let {
            var node = it
            while (node.next?.next != null) node = node.next!!
            val retVal = node.next
            node.next = null
            tail = node
            length--

            if (length <= 0) {
                length = 0
                head = null
                tail = null
            }

            retVal
        }
    }

    fun pushToHead(data: T): SingleLinkedList<T> {
        val node = Node(data, head)

        if (head == null) tail = node
        head = node
        length++

        return this
    }

    fun pushToTail(data: T): SingleLinkedList<T> {
        val node = Node(data, null)
        if (head == null) {
            head = node
            tail = node
        } else {
            tail?.next = node
            tail = node
        }

        length++

        return this
    }

    data class Node<T>(var data: T, var next: Node<T>? = null)

    override fun toString(): String {
        var retVal = StringBuilder("list[[length = ${length}][data = ")
        var node = head
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

//    class Node<T>(val data: Data<T>, var next: Node<T>?)
//    class Data<T>(val dataSet: T)
}