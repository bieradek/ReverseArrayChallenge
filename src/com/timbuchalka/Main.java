package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(array);
        System.out.println("Reversed array: " + reverse(array));
    }

    int[] array = {4, 1, 5, 2, 12}; // --> [12, 2, 5, 1, 4]

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length; int ++){
            array[i] =[array.length - i];
        }

    }
}
