package org.gradle.sample.utilities

import org.gradle.sample.list.LinkedList

object StringUtils {
    @JvmStatic
    fun join(source: LinkedList?): String? {
        return JoinUtils.join(source)
    }

    @JvmStatic
    fun split(source: String?): LinkedList? {
        return SplitUtils.split(source)
    }
}