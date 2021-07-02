package org.gradle.sample.utilities

import org.gradle.sample.list.LinkedList

internal object JoinUtils {
    fun join(source: LinkedList?): String? {
        if (source == null) return null
        val result = StringBuilder()
        for (i in 0 until source.size()) {
            if (result.isNotEmpty()) {
                result.append(" ")
            }
            result.append(source.get(i))
        }
        return result.toString()
    }
}