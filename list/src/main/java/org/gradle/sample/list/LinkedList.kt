package org.gradle.sample.list

class LinkedList {
    private var head: Node? = null
    fun add(element: String?) {
        val newNode = Node(element)
        val it = tail(head)
        if (it == null) {
            head = newNode
        } else {
            it.next = newNode
        }
    }

    fun remove(element: String?): Boolean {
        if (element == null) return false
        var result = false
        var previousIt: Node? = null
        var it: Node? = null
        it = head
        while (!result && it?.data != null) {
            if (0 == element.compareTo(it.data!!)) {
                result = true
                unlink(previousIt, it)
                break
            }
            previousIt = it
            it = it.next
        }
        return result
    }

    private fun unlink(previousIt: Node?, currentIt: Node?) {
        if (currentIt === head) {
            head = currentIt?.next
        } else {
            previousIt?.next = currentIt?.next
        }
    }

    fun size(): Int {
        var size = 0
        var it = head
        while (it != null) {
            ++size
            it = it.next
        }
        return size
    }

    operator fun get(index: Int): String? {
        var index = index
        var it = head
        while (index > 0 && it != null) {
            it = it.next
            index--
        }
        if (it == null) {
            throw IndexOutOfBoundsException("Index is out of range")
        }
        return it.data
    }

    private class Node internal constructor(val data: String?) {
        var next: Node? = null
    }

    companion object {
        private fun tail(head: Node?): Node? {
            var it: Node?
            it = head
            while (it != null && it.next != null) {
                it = it.next
            }
            return it
        }
    }
}