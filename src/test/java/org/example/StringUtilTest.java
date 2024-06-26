package org.example;

import org.junit.Assert;

class StringUtilTest {
    public static void main(String[] args) {
        Assert.assertEquals(StringUtil.repeat("Hello World", 3), "Hello WorldHello WorldHello World");
        Assert.assertEquals(StringUtil.repeat("Hello World", 1), "Hello World");
    }
}