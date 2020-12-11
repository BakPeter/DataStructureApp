package com.bpapps.datastructuresapp.chapters.chapter26graphs

import com.bpapps.datastructuresapp.chapters.chapter21stackqueue.MyStackList

class MyGraph<V : Comparable<V>> {
    private val adjacencyList: LinkedHashMap<V, ArrayList<V>> = linkedMapOf()

    fun DFSIterative(): ArrayList<V> {
        val visited = LinkedHashMap<V, Boolean>()
        val retVal = ArrayList<V>()
        val stack = MyStackList<V>()

        val first: V = adjacencyList.keys.iterator().next()
        stack.push(first)
        var currentVertex: V?
        while (stack.size != 0) {
            currentVertex = stack.pop()

            adjacencyList[currentVertex]?.forEach { neighbor ->
                if (visited.containsKey(neighbor)) {
                    if (visited[neighbor] == false) {
                        retVal.add(neighbor)
                        visited[neighbor] = true
                        stack.push(neighbor)
                    }
                } else {
                    retVal.add(neighbor)
                    visited[neighbor] = true
                    stack.push(neighbor)
                }
            }
        }

        return retVal
    }

    fun DFSRecursive(): ArrayList<V> {
        val retVal = arrayListOf<V>()
        val visited = LinkedHashMap<V, Boolean>()


        val start: V = adjacencyList.keys.iterator().next()

        DFSRecursionHelper(start, retVal, visited)

        return retVal
    }

    private fun DFSRecursionHelper(
        start: V?,
        retVal: ArrayList<V>,
        visited: LinkedHashMap<V, Boolean>
    ) {
        if (start == null) return

        retVal.add(start)
        visited[start] = true

        adjacencyList[start]?.forEach { connection ->
            if (visited.containsKey(connection)) {
                if (visited[connection] == false)
                    DFSRecursionHelper(connection, retVal, visited)
            } else {
                DFSRecursionHelper(connection, retVal, visited)
            }
        }
    }

    fun removeVertex(v: V) {
        adjacencyList[v]?.let { connections ->
            connections.forEach { connection: V ->
                removeEdge(connection, v)
            }
        }

        adjacencyList.remove(v)
    }

    fun removeEdge(v1: V, v2: V) {
        if (adjacencyList.containsKey(v1)) {
            adjacencyList[v1]!!.remove(v2)
        }
    }

    fun addEdge(v1: V, v2: V) {
        if (containsVertex(v1)) {
            adjacencyList[v1]!!.add(v2)
        } else {
            adjacencyList[v1] = arrayListOf(v2)
        }

        if (containsVertex(v2)) {
            adjacencyList[v2]!!.add(v1)
        } else {
            adjacencyList[v2] = arrayListOf(v1)
        }
    }

    fun addVertex(v: V) {
        if (!containsVertex(v))
            adjacencyList[v] = arrayListOf()
    }

    fun containsVertex(v: V) = adjacencyList.containsKey(v)
}