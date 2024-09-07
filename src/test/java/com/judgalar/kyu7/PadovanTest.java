package com.judgalar.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigInteger;
import org.junit.jupiter.api.Test;


public class PadovanTest {
    
    @Test
    public void ValueTest1() {
      assertEquals(new BigInteger("1"),Padovan.Get(1));
      assertEquals(new BigInteger("1"),Padovan.Get(2));
      assertEquals(new BigInteger("2"),Padovan.Get(3));
      assertEquals(new BigInteger("2"),Padovan.Get(4));
    }
    
    @Test
    public void ValueTest() {
      assertEquals(new BigInteger("1177482265857"),Padovan.Get(100));
    }
}