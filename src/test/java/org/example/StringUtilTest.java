package org.example;

class StringUtilTest {
    public static void main(String[] args) {
        assertEquals(StringUtil.repeat("Hello World", 3), "Hello WorldHello WorldHello World");
        assertEquals(StringUtil.repeat("Hello World", 1), "Hello World");
    }

    private static void assertEquals(String actual, String expected) {
        if (!actual.equals(expected)) {
            throw new RuntimeException(actual + " is not equal to expected" + expected);
        }
    }
}