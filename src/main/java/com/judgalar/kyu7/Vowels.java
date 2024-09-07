package com.judgalar.kyu7;


public class Vowels {

    private static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static int getCount(String str) {
        String noSpaces = str.toLowerCase().replace(" ", "");
        int count = 0;

        for(int i = 0; i < noSpaces.length(); i++) {
            char letter = noSpaces.charAt(i);
            for (char v : vowels) {
                if(letter == v) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
