package org.example;

public class StringUtil {
    public static String repeat(String s, int times) {

        String result = "";

        for (int i = 0; i < times; i++) {
            result += s;
        }

        return result;
    }
}
