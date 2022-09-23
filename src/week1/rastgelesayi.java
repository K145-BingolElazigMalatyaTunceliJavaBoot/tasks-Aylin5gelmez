package src.week1;

import java.util.Random;

public class rastgelesayi {
    public static void main(String[] args) {

        Random random = new Random();
        int sayac=0;
        int sayi =0;

        while (sayi < 50 || sayi > 100) {
            System.out.println(sayi);
            sayac++;
            sayi=random.nextInt(500);

        }
        System.out.println(sayac + ".denemede bulunan sayi :" + sayi);
    }
}



