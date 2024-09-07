/*
 Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

    Example
    "abcde" -> 0 # no characters repeats more than once
    "aabbcde" -> 2 # 'a' and 'b'
    "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
    "indivisibility" -> 1 # 'i' occurs six times
    "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
    "aA11" -> 2 # 'a' and '1'
    "ABBA" -> 2 # 'A' and 'B' each occur twice
*/

package com.judgalar.kyu7;

import java.util.HashMap;
import java.util.Map;


public class CountingDuplicates {
    public static int duplicateCount(String text) {

        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] textChars = text.toLowerCase().toCharArray();

        for ( char character : textChars ) {
            charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
        }

        int resul = 0;
        for (int count : charCountMap.values()) {
            if (count > 1) {
                resul++;
            }
        }

        return resul;
    }
}
