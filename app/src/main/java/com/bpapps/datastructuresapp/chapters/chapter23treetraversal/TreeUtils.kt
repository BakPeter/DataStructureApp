package com.bpapps.datastructuresapp.chapters.chapter23treetraversal

import com.bpapps.datastructuresapp.chapters.chapter21stackqueue.MyQueueList
import com.bpapps.datastructuresapp.chapters.chapter22binarysearchtrees.BinarySearchTree
import com.bpapps.datastructuresapp.chapters.chapter22binarysearchtrees.Node

class TreeUtils<T : Comparable<T>> : BinarySearchTree<T>() {

    fun DFSInOrder(): ArrayList<T> {
        val dataArr = arrayListOf<T>()
        traverseInOrder(root, dataArr)

        return dataArr
    }

    fun DFSPreOrder(): ArrayList<T> {
        val dataArr = arrayListOf<T>()
        traversePreOrder(root, dataArr)

        return dataArr
    }

    fun DFSPostOrder(): ArrayList<T> {
        val dataArr = arrayListOf<T>()
        traversePostOrder(root, dataArr)

        return dataArr
    }

    private fun traverseInOrder(root: Node<T>?, dataArr: java.util.ArrayList<T>) {
        root?.let { itRoot ->
            itRoot.left?.let { itLeft: Node<T> ->
                traverseInOrder(itLeft, dataArr)
            }
            dataArr.add(itRoot.data)
            itRoot.right?.let { itRight: Node<T> ->
                traverseInOrder(itRight, dataArr)
            }
        }
    }

    private fun traversePostOrder(root: Node<T>?, dataArr: java.util.ArrayList<T>) {
        root?.let { itRoot ->
            itRoot.left?.let { itLeft: Node<T> ->
                traversePostOrder(itLeft, dataArr)
            }
            itRoot.right?.let { itRight: Node<T> ->
                traversePostOrder(itRight, dataArr)
            }
            dataArr.add(itRoot.data)
        }
    }


    private fun traversePreOrder(root: Node<T>?, dataArr: ArrayList<T>) {
        root?.let { itRoot ->
            dataArr.add(itRoot.data)
            itRoot.left?.let { itLeft: Node<T> ->
                traversePreOrder(itLeft, dataArr)
            }
            itRoot.right?.let { itRight: Node<T> ->
                traversePreOrder(itRight, dataArr)
            }
        }
    }

    fun BFS(): ArrayList<T> {
        val queue = MyQueueList<Node<T>>()
        root?.let {
            queue.endQueue(it)
        }
        val retVal = arrayListOf<T>()

        var currNode: Node<T>? = null
        while (queue.size > 0) {
            currNode = queue.deQueue()?.data
            retVal.add(currNode!!.data)

            currNode.left?.let { leftNode ->
                queue.endQueue(leftNode)
            }
            currNode.right?.let { rightNode ->
                queue.endQueue(rightNode)
            }
        }

        return retVal
    }
}