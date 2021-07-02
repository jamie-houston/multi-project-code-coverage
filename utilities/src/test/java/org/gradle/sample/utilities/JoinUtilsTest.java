package org.gradle.sample.utilities;

import org.gradle.sample.list.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JoinUtilsTest {

    @Test
    public void testJoin() {
        LinkedList list = new LinkedList();
        list.add("one");
        list.add("two");
        var result = JoinUtils.join(list);
        assertEquals("one two", result);
    }

}