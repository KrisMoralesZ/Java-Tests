package org.example;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public  void testRepeat() {
        Assert.assertEquals(StringUtil.repeat("Hello World", 3), "Hello WorldHello WorldHello World");
        Assert.assertEquals(StringUtil.repeat("Hello World", 1), "Hello World");
    }
}