package com.qa.demo.testing;

public class Factorial {


    public static String reverse(double num) {
        int i = 1;

        while (num > 1)
            num /= ++i;

        if (num == 1)
            return i + "!";
        else
            return "NONE";
    }
}
