package UKLMudahKelas10;

import java.util.Scanner;

public class UKLMudahNomor1 {

    public static void operasi(int j, int b, int v){
        double bPK = 0;
        if ( j <= 10){
            bPK = 4250;
        }else{
            bPK = 6000;
        }

        double bD = b * bPK;

        double bT = 0;
        if (v > 100){
            bT = 50000;
        }

        double tB = bD + bT;

        System.out.println("Total Biaya Adalah : Rp " + tB);
    }

    public static void main(String[] args) {
        Scanner kemil = new Scanner(System.in);


        System.out.println("Masukkan Berat Paket Anda:  (KG)");
        int berat = kemil.nextInt();
        System.out.println();

        System.out.println("Masukkan Jarak Tempuh Anda:  (KM)");
        int jarak = kemil.nextInt();
        System.out.println();
        
        System.out.println("Masukkan Panjang Paket Anda:  (CM)");
        int panjang = kemil.nextInt();
        System.out.println();

        System.out.println("Masukkan Lebar Paket Anda:  (CM)");
        int lebar = kemil.nextInt();
        System.out.println();

        System.out.println("Masukkan Tinggi Paket Anda:  (CM)");
        int tinggi = kemil.nextInt();
        System.out.println();

        int volume = panjang * lebar * tinggi;

        operasi(jarak, berat, volume);       
    }
}
