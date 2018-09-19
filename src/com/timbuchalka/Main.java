package com.timbuchalka;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 2, 4, 9, 10}; // --> [10,9,4,2,5]
        System.out.println("Array " + Arrays.toString(array));
        timsReverse(array);
        System.out.println("Reversed array" + Arrays.toString(array));
    }

//    public static void reverse(int[] array) {
//        System.out.println("Array: " + Arrays.toString(array));
//        int[] arrayCopy = new int[array.length];
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            arrayCopy[i] = array[i];
//            counter++;
//        }
//        counter--;
//        System.out.println("Array copy before reverse: " + Arrays.toString(arrayCopy));
//        System.out.println("Counter equal to:" + counter);
//        int[] reversedArray = new int[array.length];
//        for (int i = 0; i <= counter; i++) {
//            reversedArray[i] = arrayCopy[counter - i];
//        }
//    }

    public static void timsReverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}