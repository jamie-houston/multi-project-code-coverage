package org.gradle.sample.androidmodule

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.gradle.sample.androidmodule.ExampleAndroidClass

class ExampleUnitTest {
    @Test
    fun returnTrue_isTrue() {
        val sampleClass = SampleAndroidClass()

        assertEquals(true, sampleClass.returnTrue())
    }
}