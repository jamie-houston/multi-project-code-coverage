package org.gradle.sample.utilities

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SplitUtilsTest {
    @Test
    fun testJoin() {
        val joinedList = "one two"
        val result = SplitUtils.split(joinedList)
        assertEquals(result?.size(), 2)
    }
}