package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


public class Problem1Test {


    @Test
    public void testCharReplacement(){
       //given
       String input = "The Farmer went to the store to get 1 dollar’s worth of fertilizer";

       //when
       String actual = Problem1.charReplacement(input);
       String expected = "The 7@rmer went to the $tore to get ! doll@r’$ worth o7 7ertilizer";

       //then
       Assert.assertEquals(expected, actual);

    }
}
