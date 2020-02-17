package com.demigod.tutorial.impQs;

import java.util.Arrays;

public class IntListReverse {
    public static void main(String... args) {
        int[] arr = {1, 2, 3, 4, 5};
        int temp = 0;
        int j = arr.length - 1;
        int mid = arr.length / 2;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j--] = temp;
            if (i == mid)
                break;
        }

        Arrays.stream(arr).forEach(s -> {
            System.out.println(s);
        });
    }
}
