package com.demigod.tutorial.impQs;

public class IntToNum {

    // Question:- How will you convert "123456" into Integer without using built-in functions
    public static void main(String... args) {
        System.out.println(getNumber("12345"));
    }

    /**
     * Logic:- Subtract the character '0' from each numeric character to give you its int value,
     * Then build up the number by multiplying the current sum by 10 before adding the next digit's ìnt value.
     *
     * @param number
     * @return
     */
    public static int getNumber(String number) {
        int result = 0;
        for (int i = 0; i < number.length(); i++) {
            result = result * 10 + number.charAt(i) - '0';
        }
        return result;
    }

}
