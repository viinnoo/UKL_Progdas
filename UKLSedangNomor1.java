package UKLSedangKelas10;

import java.util.Scanner;

public class UKLSedangNomor1 {
    public static void main(String[] args) {
        Scanner kemil = new Scanner(System.in);
        int total = 1;

        System.out.println("Masukkan Angka Yang Ingin Anda Faktorisasikan: ");
        int num = kemil.nextInt();
        System.out.println();

        for (int i = 1; i <= num; i++) {
            total = total * i;    
        } 
        System.out.println("Faktorial Dari " +num + " adalah " + total + ".");




    }
}
