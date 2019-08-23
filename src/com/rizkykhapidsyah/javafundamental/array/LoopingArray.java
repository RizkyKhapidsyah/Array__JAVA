package com.rizkykhapidsyah.javafundamental.array;

public class LoopingArray {
    public static void TampilHasilLooping() {
        int X = 0, Y = 0;
        int[] arrInt = new int[100]; //Array

        for (X = 0; X < arrInt.length; X++) {
            arrInt[X] = X + 1;
            System.out.println(arrInt[X]);
        }

        System.out.println("\nAtau Bisa juga Mendatar Seperti ini :");
        for (Y = 0; Y <= arrInt.length; Y++) {
            for (X = 0; X < arrInt.length; X++) {
                arrInt[X] = X + 1;
                System.out.print(arrInt[X] + ", ");
            }
            System.out.println("");
        }
    }
}
