package com.mns.cda.banque;

public class Utils {
    public static String generateCode(String input) {
        return Integer.toHexString(input.hashCode()).toUpperCase().substring(0, 8);
    }
}
