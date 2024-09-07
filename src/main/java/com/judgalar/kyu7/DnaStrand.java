/*
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
Your function receives one side of the DNA (string, except for Haskell);
you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)

Example: (input --> output)

"ATTGC" --> "TAACG"
"GTAT" --> "CATA"
*/
package com.judgalar.kyu7;


public class DnaStrand {
    public static String makeComplement(String dna) {

        String dnaStr = dna.toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dnaStr.length(); i++) {
            char c = dnaStr.charAt(i);
            switch (c) {
                case 'A':
                    sb.append("T");
                    break;
                case 'T':
                    sb.append("A");
                    break;
                case 'C':
                    sb.append("G");
                    break;
                case 'G':
                    sb.append("C");
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }

        return sb.toString();
    }
}
