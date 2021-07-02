package org.gradle.sample.app

import org.gradle.sample.list.LinkedList
import org.gradle.sample.utilities.StringUtils.join
import org.gradle.sample.utilities.StringUtils.split

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val tokens: LinkedList?
        tokens = split(MessageUtils.getMessage())
        println(join(tokens))
    }
}