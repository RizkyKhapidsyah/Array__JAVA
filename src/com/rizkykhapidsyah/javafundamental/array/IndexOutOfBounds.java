package com.rizkykhapidsyah.javafundamental.array;

public class IndexOutOfBounds {
    public static void TampilkanError() {
        int[] arrA = {1, 2, 3, 4};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);

        // Mencoba Akses indeks ke 4 (Ini akan menampilkan Error
        System.out.println(arrA[4]);
    }
}
