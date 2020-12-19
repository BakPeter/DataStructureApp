package com.bpapps.datastructuresapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bpapps.datastructuresapp.chapters.chapter26graphs.MyGraph
import com.bpapps.datastructuresapp.chapters.chapter28.MyWeightedGraph
import kotlinx.android.synthetic.main.fragment_main.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class MainFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private val size = 0

    private var counter: Int = 0
    private val text: String = "Result Shower"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val intArr: IntArray = IntArray(8) { i: Int -> i }
//        val i: Char = 'a'
//        val b: Int = i.toInt()

        btnRunFuncs.setOnClickListener {
            //===============================================================
            //===============================================================
            //chapter 28

            val graph = MyWeightedGraph<String>()
            graph.addVertex("A")
            graph.addVertex("B")
            graph.addVertex("C")

            graph.addEdge("A", "B", 10)
            graph.addEdge("A", "C", 5)
            graph.addEdge("B", "C", 7)

            val x = 0

            //chapter27
//            val graph = MyGraph<String>()
//            graph.addVertex("A")
//            graph.addVertex("B")
//            graph.addVertex("C")
//            graph.addVertex("D")
//            graph.addVertex("E")
//            graph.addVertex("F")
//
//            graph.addEdge("A", "B")
//            graph.addEdge("A", "C")
//            graph.addEdge("B", "D")
//            graph.addEdge("C", "E")
//            graph.addEdge("D", "E")
//            graph.addEdge("D", "F")
//            graph.addEdge("E", "F")
//
//            Log.d(TAG, "graph.DFS() : ${graph.DFSRecursive()}")
//            Log.d(TAG, "graph.DFSIterative() : ${graph.DFSIterative()}")

            //chapter26
//            graph.addVertex("Tokyo")
//            graph.addVertex("Tokyo")
//            graph.addVertex("Dallas")
//            graph.addVertex("Aspen")
//            graph.addVertex("Hong Kong")
//
//            graph.addEdge("Tokyo", "Dallas")
//            graph.addEdge("Hong Kong", "Tokyo")
//            graph.addEdge("Hong Kong", "LA")
//            graph.addEdge("Hong Kong", "Tokyo")
//
//            graph.removeVertex("Hong Kong")
//            graph.removeEdge("Tokyo", "Dallas")
//            graph.removeEdge("Tel Aviv", "Dallas")
//            graph.removeEdge("Aspen", "Dallas")

            //chapter24
//            val heap = MaxBinaryHeap<Int>()
//            Log.d(TAG, "heap.insert(41) : ${heap.insert(30)}")
//            Log.d(TAG, "heap.insert(39) : ${heap.insert(39)}")
//            Log.d(TAG, "heap.insert(33) : ${heap.insert(33)}")
//            Log.d(TAG, "heap.insert(40) : ${heap.insert(40)}")
//            Log.d(TAG, "heap.insert(27) : ${heap.insert(27)}")
//            Log.d(TAG, "heap.insert(12) : ${heap.insert(12)}")
//            Log.d(TAG, "heap.insert(55) : ${heap.insert(55)}")

            //chapter22-23
//            val tree = TreeUtils<Int>()
//            tree.insert(10)
//            tree.insert(6)
//            tree.insert(15)
//            tree.insert(3)
//            tree.insert(8)
//            tree.insert(20)

//            Log.d(TAG, "${tree.find(10)}")
//            Log.d(TAG, "${tree.find(6)}")
//            Log.d(TAG, "${tree.find(15)}")
//            Log.d(TAG, "${tree.find(3)}")
//            Log.d(TAG, "${tree.find(8)}")
//            Log.d(TAG, "${tree.find(20)}")

//            Log.d(TAG, "tree.BFS() : ${tree.BFS()}")
//            Log.d(TAG, "tree.DFSPreOrder() : ${tree.DFSPreOrder()}")
//            Log.d(TAG, "tree.DFSPostOrder() : ${tree.DFSPostOrder()}")
//            Log.d(TAG, "tree.DFSInOrder() : ${tree.DFSInOrder()}")


            //chapter 21
//            val stack: MyStackList<String> = MyStackList()
//            Log.d(TAG, stack.toString())
//            Log.d(TAG, "stack.push(str1111) : ${stack.push("str1111")}")
//            Log.d(TAG, "stack.push(str2222) : ${stack.push("str2222")}")
//            Log.d(TAG, "stack.push(str3333) : ${stack.push("str3333")}")
//            Log.d(TAG, "stack.push(str4444) : ${stack.push("str4444")}")
//            Log.d(TAG, stack.toString())
//            Log.d(TAG,"stack.pop() : ${stack.pop()}")
//            Log.d(TAG, stack.toString())
//
//            Log.d(TAG,"stack.pop() : ${stack.pop()}")
//            Log.d(TAG, stack.toString())
//
//            Log.d(TAG,"stack.pop() : ${stack.pop()}")
//            Log.d(TAG, stack.toString())
//
//            Log.d(TAG,"stack.pop() : ${stack.pop()}")
//            Log.d(TAG, stack.toString())
//
//            Log.d(TAG,"stack.pop() : ${stack.pop()}")
//            Log.d(TAG, stack.toString())
//            val queue = MyQueueList<Double>()
//            Log.d(TAG, queue.toString())
//
//            Log.d(TAG, "queue.endQueue(11.11) : ${queue.endQueue(11.11)}")
//            Log.d(TAG, queue.toString())
//
//            Log.d(TAG, "queue.endQueue(22.22) : ${queue.endQueue(22.22)}")
//            Log.d(TAG, queue.toString())
//
//            Log.d(TAG, "queue.endQueue(33.33) : ${queue.endQueue(33.33)}")
//            Log.d(TAG, queue.toString())
//
//            Log.d(TAG, "queue.deQueue() : ${queue.deQueue()}")
//            Log.d(TAG, queue.toString())
//
//            Log.d(TAG, "queue.deQueue() : ${queue.deQueue()}")
//            Log.d(TAG, queue.toString())
//
//            Log.d(TAG, "queue.deQueue() : ${queue.deQueue()}")
//            Log.d(TAG, queue.toString())
//
//            Log.d(TAG, "queue.deQueue() : ${queue.deQueue()}")
//            Log.d(TAG, queue.toString())
//
//            Log.d(TAG, "queue.deQueue() : ${queue.deQueue()}")
//            Log.d(TAG, queue.toString())
//
            //chapter 20
//            val list = DoublyLinkedList<Int>()
//            Log.d(TAG, "pushToTheEnd(1) : ${list.pushToEnd(1)}")
//            Log.d(TAG, "pushToTheEnd(2) : ${list.pushToEnd(2)}")
//            Log.d(TAG, "pushToTheEnd(3) : ${list.pushToEnd(3)}")
//            Log.d(TAG, "pushToTheEnd(4) : ${list.pushToEnd(4)}")

//            Log.d(TAG, "pushToTheEnd(5) : ${list.pushToEnd(5)}")
//            Log.d(TAG, "pushToTheEnd(6) : ${list.pushToEnd(6)}")
//            Log.d(TAG, "pushToTheEnd(7) : ${list.pushToEnd(7)}")
//
//            Log.d(TAG, "popFromTheEnd() : ${list.popFromTail()}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "popFromTheEnd() : ${list.popFromTail()}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "popFromTheEnd() : ${list.popFromTail()}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "popFromHead() : ${list.popFromHead()}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "popFromHead() : ${list.popFromHead()}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "popFromHead() : ${list.popFromHead()}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "popFromHead() : ${list.popFromHead()}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "popFromHead() : ${list.popFromHead()}")
//            Log.d(TAG, list.toString())

//            Log.d(TAG, "get(5) : ${list.get(5)}")

//            Log.d(TAG, "pushToHead(1) : ${list.pushToHead(1)}")
//            Log.d(TAG, "pushToHead(2) : ${list.pushToHead(2)}")
//            Log.d(TAG, "pushToHead(3) : ${list.pushToHead(3)}")
//            Log.d(TAG, "pushToHead(4) : ${list.pushToHead(4)}")
//            Log.d(TAG, "pushToHead(5) : ${list.pushToHead(5)}")
//            Log.d(TAG, "pushToHead(6) : ${list.pushToHead(6)}")
//            Log.d(TAG, "pushToHead(7) : ${list.pushToHead(7)}")
//            Log.d(TAG, "pushToHead(8) : ${list.pushToHead(8)}")
//            Log.d(TAG, "pushToHead(9) : ${list.pushToHead(9)}")

//            Log.d(TAG, "get(-1) : ${list.get(-1)}")
//            Log.d(TAG, "get(100) : ${list.get(100)}")
//            Log.d(TAG, "get(0) : ${list.get(0)}")
//            Log.d(TAG, "get(1) : ${list.get(1)}")
//            Log.d(TAG, "get(3) : ${list.get(3)}")
//            Log.d(TAG, "get(5) : ${list.get(5)}")
//            Log.d(TAG, "get(6) : ${list.get(6)}")

//            Log.d(TAG, "set(0, 11110000) : ${list.set(0, 11110000)}")
//            Log.d(TAG, "$list")
//
//            Log.d(TAG, "set(-1, 11110000) : ${list.set(-1, 11110000)}")
//            Log.d(TAG, "$list")
//
//            Log.d(TAG, "set(100, 11110000) : ${list.set(100, 11110000)}")
//            Log.d(TAG, "$list")
//
//            Log.d(TAG, "set(3, 333333) : ${list.set(3, 333333)}")
//            Log.d(TAG, "$list")

//            Log.d(TAG, "insert(-1, 100) : ${list.insert(-1, 100)}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "insert(100, 100) : ${list.insert(100, 100)}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "insert(0, 100) : ${list.insert(0, 100)}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "insert(list.length, 100) : ${list.insert(list.length, 100)}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "insert(list.length - 1, 100) : ${list.insert(list.length - 1, 100)}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "insert(3, 400) : ${list.insert(3, 400)}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "insert(6, 600) : ${list.insert(6, 600)}")
//            Log.d(TAG, list.toString())

//            Log.d(TAG, "==============")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "===========================================")
//            Log.d(TAG, "list.remove(-1) : ${list.remove(-1)}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "===========================================")
//
//            Log.d(TAG, "list.remove(100) : ${list.remove(100)}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "===========================================")
//
//            Log.d(TAG, "list.remove(0) : ${list.remove(0)}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "===========================================")
//
//            Log.d(TAG, "list.remove(list.length - 1) : ${list.remove(list.length - 1)}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "===========================================")
//
//            Log.d(TAG, "list.remove(2) : ${list.remove(2)}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "===========================================")
//
//            Log.d(TAG, "list.remove(3) : ${list.remove(3)}")
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "===========================================")

//            Log.d(TAG, list.toString())
//            Log.d(TAG, list.reverse()?.toString())

            //chapter 19
//            val list = SingleLinkedList<String>()
//            val node1 = SingleLinkedList.Node(SingleLinkedList.Data(1), null)
//            val node2 = SingleLinkedList.Node(SingleLinkedList.Data("str"), null)
//            val node3 = SingleLinkedList.Node(SingleLinkedList.Data("str22e23e"), null)
//            Log.d(TAG, "PushAtTheEnd : ${list.pushToTail("str1")}")
//            Log.d(TAG, "PushAtTheEnd : ${list.pushToTail("str2")}")
//            Log.d(TAG, "PushAtTheEnd : ${list.pushToTail("str3")}")
//            Log.d(TAG, "PushAtTheEnd : ${list.pushToTail("str4")}")
//            Log.d(TAG, "PushAtTheEnd : ${list.pushToTail("str5")}")
//            Log.d(TAG, "${list.popFromTheEnd()}, $list")
//            Log.d(TAG, "${list.popFromTheEnd()}, $list")
//            Log.d(TAG, "${list.popFromTheEnd()}, $list")
//            Log.d(TAG, "${list.popFromTheEnd()}, $list")
//            Log.d(TAG, "${list.popFromTheEnd()}, $list")
//            Log.d(TAG, "${list.popFromTheEnd()}, $list")
//            Log.d(TAG, "${list.popFromTheEnd()}, $list")
//            Log.d(TAG, "${list.popFromTheEnd()}, $list")
//            Log.d(TAG, "PopFromHead  :  ${list.popFromHead()}, $list")
//            Log.d(TAG, "PopFromHead  :  ${list.popFromHead()}, $list")
//            Log.d(TAG, "PopFromHead  :  ${list.popFromHead()}, $list")
//            Log.d(TAG, "PopFromHead  :  ${list.popFromHead()}, $list")
//            Log.d(TAG, "PopFromHead  :  ${list.popFromHead()}, $list")
//            Log.d(TAG, "PopFromHead  :  ${list.popFromHead()}, $list")
//            Log.d(TAG, "PushToHead : ${list.pushToHead("strrrr1")}")
//            Log.d(TAG, "PushToHead : ${list.pushToHead("strrrr22")}")
//            Log.d(TAG, "PushToHead : ${list.pushToHead("strrrr333")}")

//            Log.d(TAG, list.toString())
//            Log.d(TAG, "get(${0}) = ${list.get(0)}")
//            Log.d(TAG, "get(${-1}) = ${list.get(-1)}")
//            Log.d(TAG, "get(${110}) = ${list.get(110)}")
//            Log.d(TAG, "get(${3}) = ${list.get(3)}")
//            Log.d(TAG, "get(${8}) = ${list.get(8)}")
//            Log.d(TAG, "get(${7}) = ${list.get(7)}")
//            Log.d(TAG, "set(${0}, ${"0000000"}) ==> ${list.set(0, "0000000")}")
//            Log.d(TAG, "set(${0}, ${"98989898989"}) ==> ${list.set(0, "98989898989")}")
//            Log.d(TAG, "set(${1}, ${"1111111"}) ==> ${list.set(1, "1111111")}")
//            Log.d(TAG, "set(${-1}, ${"-111111"}) ==> ${list.set(-1, "-111111111")}")
//            Log.d(TAG, "set(${9}, ${"9999999"}) ==> ${list.set(-1, "9999999")}")
//            Log.d(TAG, "set(${7}, ${"7777777"}) ==> ${list.set(7, "7777777")}")

//            Log.d(TAG, "insert(${0}, ${"insert00000"}) ==> ${list.insert(0, "insert00000")}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "insert(${7}, ${"insert77777"}) ==> ${list.insert(7, "insert77777")}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "insert(${90}, ${"insert90null"}) ==> ${list.insert(90, "insert90null")}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "insert(${-1}, ${"insert-1null"}) ==> ${list.insert(-1, "insert-1null")}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "insert(${4}, ${"insert44444"}) ==> ${list.insert(4, "insert44444")}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "remove(${-1}) ==> ${list.remove(-1)}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "remove(${0}) ==> ${list.remove(0)}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "remove(${list.length - 1}) ==> ${list.remove(list.length - 1)}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, "remove(${list.length}) ==> ${list.remove(list.length)}")
//            Log.d(TAG, list.toString())
//
//
//            Log.d(TAG, "remove(${2}) ==> ${list.remove(2)}")
//            Log.d(TAG, list.toString())
//
//            Log.d(TAG, list.toString())
//            Log.d(TAG, "revers() ==> ${list.reverse()}")
//            Log.d(TAG, list.toString())
//            val node2 = SingleLinkedList.Node("str", null)
//            val node3 = SingleLinkedList.Node("str22e23e", null)
//            node2.next = node3

            //chapter 10
//            Log.d(TAG, "${Chapter10.stringSearch("aufcgabcknji", "abc")}")
//            Log.d(TAG, "${Chapter10.stringSearch("aufcgabcknji", "aaa")}")
//            Log.d(TAG, "${Chapter10.stringSearch("abgabcknji", "abc")}")

            //chapter 6
//            val a = -3
//            Log.d(TAG, "${-3 - 3}")
//            Log.d(TAG, "${-3 + 3}")
//            Log.d(TAG, "${-3 - a}")
//            Log.d(TAG, "${Chapter6.maxSubArraySum(arrayOf(100, 200, 300, 400), 2)}")
//            Log.d(TAG, "${Chapter6.maxSubArraySum(arrayOf(1, 4, 2, 10, 23, 3, 1, 0, 20), 4)}")
//            Log.d(TAG, "${Chapter6.maxSubArraySum(arrayOf(-3, 4, 0, -2, 6, -1), 2)}")
//            Log.d(TAG, "${Chapter6.maxSubArraySum(arrayOf(3, -2, 7, -4, 1, -1, 4, -2, 1), 2)}")
//            Log.d(TAG, "${Chapter6.maxSubArraySum(arrayOf(2, 3), 3)}")

//            Log.d(TAG, "1${Chapter6.isSubSequence("hello", "hello world")}")
//            Log.d(TAG, "${Chapter6.isSubSequence("sing", "sting")}")
//            Log.d(TAG, "${Chapter6.isSubSequence("abc", "abracadabra")}")
//            Log.d(TAG, "${Chapter6.isSubSequence("abc", "acb")}")

//            Log.d(TAG, "${Chapter6.averagePair(arrayOf(1, 2, 3), 2.5)}")
//            Log.d(TAG, "${Chapter6.averagePair(arrayOf(1, 2, 3, 4), 1.75)}")

//            Log.d(TAG, "${Chapter6.areThereDuplicates(arrayOf(5, 9, 1, 2, 14, -10, 3, 4))}")
//            Log.d(TAG, "${Chapter6.areThereDuplicates(arrayOf(5, 9, 1, 2, 14, 5, -10, 3, 4))}")
//            Log.d(TAG, "${Chapter6.areThereDuplicatesInSortedArr(arrayOf(1, 2, 3, 4))}")
//            Log.d(TAG, "${Chapter6.areThereDuplicatesInSortedArr(arrayOf(1, 2, 3, 3, 4))}")

//            Log.d(TAG, "${Chapter6.digitsFrequencyCounter(45324, 0)}")
//            Log.d(TAG, "${Chapter6.digitsFrequencyCounter(45324, 98654)}")
//            Log.d(TAG, "${Chapter6.digitsFrequencyCounter(-98654, 65987)}")

            //===============================================================
            //===============================================================

            //===============================================================
            //===============================================================
            //chapters 1-5
//            val arr = arrayOf(
//                -9,
//                -9,
//                -2,
//                -1,
//                0,
//                1,
//                1,
//                2,
//                2,
//                2,
//                3,
//                5,
//                5,
//                6
//            )
//            Log.d(
//                TAG,
//                "countUniqueValues = ${Chapters1_5().countUniqueValues(arr)}"
//            )
//
//            Log.d(
//                TAG,
//                "frequencyCounterValidAnagram = ${
//                    Chapters1_5().frequencyCounterValidAnagram(
//                        "ccababbcdeee",
//                        "ccababbcdeee"
//                    )
//                }"
//            )
//            Log.d(
//                TAG,
//                "frequencyCounterValidAnagram = ${
//                    Chapters1_5().frequencyCounterValidAnagram(
//                        "abdcd",
//                        "caabd"
//                    )
//                }"
//            )
//
//            Log.d(
//                TAG,
//                "frequencyCounterValidAnagram = ${
//                    Chapters1_5().frequencyCounterValidAnagram(
//                        "abcyddd",
//                        "abcyjyd"
//                    )
//                }"
//            )
            //===============================================================
            //===============================================================

//            counter++
//            tvResultShower.text = "$text + $counter"
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MainFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }

        const val TAG = "TAG.MainFragment"
        const val FRAGMENT_TAG: String =
            "FRAGMENT_TAG_ com.bpapps.datastructuresapp.MainFragment"
    }
}