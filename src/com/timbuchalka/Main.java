package com.timbuchalka;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {5,2,212,19,8,6,4, 1, 5, 2, 12}; // --> [12, 2, 5, 1, 4]
        reverse(array);
    }

    public static void reverse(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
        int[] arrayCopy = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            arrayCopy[i] = array[i];
            counter++;
        }
        counter--;
        System.out.println("Array copy before reverse: " + Arrays.toString(arrayCopy));
        System.out.println("Counter equal to:" + counter);
        int[] reversedArray = new int[array.length];
        for (int i = 0; i <= counter; i++) {
            reversedArray[i] = arrayCopy[counter - i];
//            0 -> 4
//            1 -> 3
//            2 -> 2
//            3 -> 1
//            4 -> 0
        }
        System.out.println("***********************************");
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Array copy: " + Arrays.toString(arrayCopy));
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }
}