/*
The Padovan sequence is the sequence of integers P(n) defined by the initial values

P(0)=P(1)=P(2)=1

and the recurrence relation

P(n)=P(n-2)+P(n-3)

The first few values of P(n) are

1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, 49, 65, 86, 114, 151, 200, 265, ...
*/
package com.judgalar.kyu7;

import java.math.BigInteger;


public class Padovan {
    public static BigInteger Get (long power)
    {

        if (power == 0 || power == 1 || power == 2) {
            return BigInteger.ONE;
        }

        BigInteger p0 = BigInteger.ONE;
        BigInteger p1 = BigInteger.ONE;
        BigInteger p2 = BigInteger.ONE;
        BigInteger current = BigInteger.ZERO;

        for(int i = 3; i <= power; i++) 
        {
            current = p0.add(p1); // P(n) = P(n-2) + P(n-3)

            p0 = p1;
            p1 = p2;
            p2 = current;
        }

        return current;
    }
}
