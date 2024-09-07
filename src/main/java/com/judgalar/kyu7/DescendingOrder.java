/*
 Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially,
 rearrange the digits to create the highest possible number.

    Examples:
    Input: 42145 Output: 54421

    Input: 145263 Output: 654321

    Input: 123456789 Output: 987654321
 */

package com.judgalar.kyu7;

import java.util.Arrays;
import java.util.Collections;


public class DescendingOrder {
    public static int sortDesc(final int num) {
        if (num < 0) return -1;

        String numStr = Integer.toString(num);

        Character[] characters = new Character[numStr.length()];
        for( int i = 0; i < characters.length; i++) {
            characters[i] = numStr.charAt(i);
        }

        Arrays.sort(characters, Collections.reverseOrder());

        StringBuilder sortedStr = new StringBuilder(characters.length);
        for (Character c : characters) {
            sortedStr.append(c);
        }

        return Integer.valueOf(sortedStr.toString());
    }
  }