import com.rizkykhapidsyah.javafundamental.array.IndexOutOfBounds;
import com.rizkykhapidsyah.javafundamental.array.InisiasiArray;
import com.rizkykhapidsyah.javafundamental.array.LoopingArray;
import com.rizkykhapidsyah.javafundamental.array.MultiDimensionalArray;

public class Main {
    public static void main(String[] args){
        //Tampilkan Array
        System.out.println("Inisiasi Array Cara 1:");
        InisiasiArray.Cara1();
        System.out.println("\nInisiasi Array Cara 2:");
        InisiasiArray.Cara2();
        System.out.println("\nInisiasi Array Cara 3:");
        InisiasiArray.Cara3();
        System.out.println("\nLooping Array:");
        LoopingArray.TampilHasilLooping();
        System.out.println("\nMultiDimension Array:");
        MultiDimensionalArray.TampilHasilMultiDimensionalArray();
        System.out.println("\nMenampilkan Error IndexOutOfBounds:");
        IndexOutOfBounds.TampilkanError();
    }
}
