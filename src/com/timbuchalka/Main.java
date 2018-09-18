package com.timbuchalka;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] array = {4, 1, 5, 2, 12}; // --> [12, 2, 5, 1, 4]
        System.out.println("Normal array: " + Arrays.toString(array));
        reverse(array);
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[array.length - i]; // 4 --> 4
        }
        System.out.println("Reversed array: " + Arrays.toString(array));
    }
}


//