package com.mns.cda.banque;

public class Utils {
    public static String generateCode(String input) {
        String hex = Integer.toHexString(input.hashCode()).toUpperCase();

        if (hex.length() >= 8) {
            return hex.substring(0, 8);
        }

        return String.format("%8s", hex).replace(' ', '0');
    }
}
