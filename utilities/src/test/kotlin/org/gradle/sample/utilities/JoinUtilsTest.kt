package org.gradle.sample.utilities

import org.gradle.sample.list.LinkedList
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class JoinUtilsTest {
    @Test
    fun testJoin() {
        val list = LinkedList()
        list.add("one")
        list.add("two")
        val result = JoinUtils.join(list)
        Assertions.assertEquals("one two", result)
    }
}