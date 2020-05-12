package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int y = 0;
        for (int i = 1; i <= 99; i += 2) {
            y++;
        }

        int[] array = new int[y];
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a += 2;

        }
        System.out.print(Arrays.toString(array));

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
