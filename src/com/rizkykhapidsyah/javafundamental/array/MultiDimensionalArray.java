package com.rizkykhapidsyah.javafundamental.array;

public class MultiDimensionalArray {
    public static void TampilHasilMultiDimensionalArray() {
        char[][] ArrChar = new char[2][];

        ArrChar[0] = new char[2];
        ArrChar[1] = new char[3];

        // Dimensi 1 yang indeksnya 0 memiliki panjang elemen 2
        ArrChar[0][0] = 'A';
        ArrChar[0][1] = 'B';

        // Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
        ArrChar[1][0] = 'C';
        ArrChar[1][1] = 'D';
        ArrChar[1][2] = 'E';

        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + ArrChar[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + ArrChar[0][1]);

        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : " + ArrChar[1][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : " + ArrChar[1][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + ArrChar[1][2]);

    }
}
