package com.bpapps.datastructuresapp.chapters.chapter22binarysearchtrees

open class BinarySearchTree<T : Comparable<T>> {

    protected var root: Node<T>? = null

    fun find(data: T): Boolean = when (root) {
        null -> false
        else -> root!!.findNode(data)
    }


    fun insert(data: T) {
        val node = Node(data)

        if (root == null) {
            root = node
        } else {
            root!!.insertNode(node)
        }
    }
}

class Node<T : Comparable<T>>(
    var data: T,
    var left: Node<T>? = null,
    var right: Node<T>? = null
) {
    fun insertNode(node: Node<T>) {
        if (this.data > node.data) {
            if (this.left == null) {
                this.left = node
            } else {
                this.left!!.insertNode(node)
            }
        } else if (this.data < node.data) {
            if (this.right == null) {
                this.right = node
            } else {
                this.right!!.insertNode(node)
            }
        } else {
            //this.data == node.data
            return
        }
    }

    fun findNode(data: T): Boolean = when {
        this.data == data -> true
        left != null && this.data > data -> left!!.findNode(data)
        right != null && this.data < data -> right!!.findNode(data)
        else -> false
    }
}