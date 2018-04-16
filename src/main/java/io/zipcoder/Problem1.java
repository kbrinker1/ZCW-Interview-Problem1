package io.zipcoder;



public class Problem1 {

    public static String charReplacement(String input) {

        String str = input
                .replace("f", "7")
                .replace("F", "7")
                .replace("s", "$")
                .replace("S", "$")
                .replace("1", "!")
                .replace("a", "@")
                .replace("A", "@");

        return str;

    }
}


