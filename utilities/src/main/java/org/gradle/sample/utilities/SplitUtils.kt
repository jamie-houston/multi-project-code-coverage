package org.gradle.sample.utilities

import org.gradle.sample.list.LinkedList

internal object SplitUtils {
    fun split(source: String?): LinkedList? {
        if (source == null) return null
        var lastFind = 0
        var currentFind = 0
        val result = LinkedList()
        while (source.indexOf(" ", lastFind).also { currentFind = it } != -1) {
            var token = source.substring(lastFind)
            if (currentFind != -1) {
                token = token.substring(0, currentFind - lastFind)
            }
            addIfValid(token, result)
            lastFind = currentFind + 1
        }
        val token = source.substring(lastFind)
        addIfValid(token, result)
        return result
    }

    private fun addIfValid(token: String?, list: LinkedList?) {
        if (isTokenValid(token)) {
            list?.add(token)
        }
    }

    private fun isTokenValid(token: String?): Boolean {
        return !token.isNullOrEmpty()
    }
}