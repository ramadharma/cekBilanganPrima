package cekbilanganprima;

import java.util.Scanner;

public class CekBilanganPrima {

    public static void main(String[] args) {

//        Deklarasi object scanner
        Scanner in = new Scanner(System.in);

//        Deklarasi variable
        int angka; // untuk menampung angka yang diinputkan
        int temp = 0; // untuk menampung bilangan pembagi
        boolean prima = true; // untuk menampung kondisi prima atau tidak

//        Inputan angka
        System.out.print("Masukan angka bilangan bulat: ");
        angka = in.nextInt();

//        Perulangan untuk menemukan bilangan prima atau tidak,jika bilangan yang
//        diinputkan dapat dibagi dengan bilangan selain 1 dan bilangan itu sendiri 
//        maka looping terhenti menandakan bilangan tersebutprima
        for (int x = 2; x <= angka / 2; x++) {
            if (angka % x == 0) {
                prima = false;
                temp = x;
                break;
            }
        }

//        Proses output memanggil hasil dari iterasi perulangan diatas
        if (prima) {
            System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka + " bukan bilangan prima, karena bisa dibagi " + temp);
        }

    }

}
