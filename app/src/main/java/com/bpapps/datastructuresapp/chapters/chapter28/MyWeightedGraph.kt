package com.bpapps.datastructuresapp.chapters.chapter28

class MyWeightedGraph<V : Comparable<V>> {
    private val adjacencyList: LinkedHashMap<V, ArrayList<Node<V>>> = linkedMapOf()

    fun addEdge(v1: V, v2: V, weight: Int) {
        if (containsVertex(v1)) {
            adjacencyList[v1]!!.add(Node(v2, weight))
        } else {
            adjacencyList[v1] = arrayListOf(Node(v2, weight))
        }

        if (containsVertex(v2)) {
            adjacencyList[v2]!!.add(Node(v1, weight))
        } else {
            adjacencyList[v2] = arrayListOf(Node(v1, weight))
        }
    }

    fun addVertex(v: V) {
        if (!containsVertex(v))
            adjacencyList[v] = arrayListOf()
    }

    fun containsVertex(v: V) = adjacencyList.containsKey(v)

    class Node<V : Comparable<V>>(val v: V, val weight: Int)
}