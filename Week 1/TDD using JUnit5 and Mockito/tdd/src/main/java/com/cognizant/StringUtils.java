package com.cognizant;

public class StringUtils {

    public String toUpperCase(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public boolean isEmpty(String str) {
        return str.isEmpty();
    }

    public int stringLength(String str) {
        return str.length();
    }
}