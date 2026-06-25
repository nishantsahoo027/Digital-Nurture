package com.cognizant;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
    }

    @Test
    void testIsEmpty() {
        assertTrue(utils.isEmpty(""));
    }

    @Test
    void testStringLength() {
        assertEquals(5, utils.stringLength("Hello"));
    }

    @Test
    void testNull() {
        assertNull(utils.toUpperCase(null));
    }

    @Test
    void testNotNull() {
        assertNotNull(utils.toUpperCase("java"));
    }

    @Test
    void testFalse() {
        assertFalse(utils.isEmpty("JUnit"));
    }
}