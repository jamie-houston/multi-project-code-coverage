package org.gradle.sample.list

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class LinkedListTest {
    @Test
    fun testConstructor() {
        val list = LinkedList()
        Assertions.assertEquals(0, list.size())
    }

    @Test
    fun testAdd() {
        val list = LinkedList()
        list.add("one")
        Assertions.assertEquals(1, list.size())
        Assertions.assertEquals("one", list[0])
        list.add("two")
        Assertions.assertEquals(2, list.size())
        Assertions.assertEquals("two", list[1])
    }

    @Test
    fun testRemove() {
        val list = LinkedList()
        list.add("one")
        list.add("two")
        Assertions.assertTrue(list.remove("one"))
        Assertions.assertEquals(1, list.size())
        Assertions.assertEquals("two", list[0])
        Assertions.assertTrue(list.remove("two"))
        Assertions.assertEquals(0, list.size())
    }

    @Test
    fun testRemoveMissing() {
        val list = LinkedList()
        list.add("one")
        list.add("two")
        Assertions.assertFalse(list.remove("three"))
        Assertions.assertEquals(2, list.size())
    }
}