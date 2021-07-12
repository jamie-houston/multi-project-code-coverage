package org.gradle.sample.utilities

import org.gradle.sample.list.LinkedList
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StringUtilsTest {
    @Test
    fun testRemoveMissing() {
        val list = LinkedList()
        list.add("one")
        list.add("two")
        val result = StringUtils.join(list)
        Assertions.assertEquals("one two", result)
    }
}