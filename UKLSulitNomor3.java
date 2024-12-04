import java.util.Scanner;

public class UKLSulitNomor3 {
    public static void main(String[] args) {
        Scanner kemil = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Elemen Dalam Array: ");
        int zzz = kemil.nextInt();
        
        int[] aww = new int[zzz];
        
        System.out.println("Masukkan Elemen-Elemen Array:");
        for (int i = 0; i < zzz; i++) {
            System.out.print("Elemen Ke-" + (i + 1) + ": ");
            aww[i] = kemil.nextInt();
        }
        
        System.out.println("\nFrekuensi Setiap Elemen Dalam Array:");
        for (int i = 0; i < zzz; i++) {
            int frekuensi = 1;
            
            if (aww[i] != -1) {
                for (int j = i + 1; j < zzz; j++) {
                    if (aww[i] == aww[j]) {
                        frekuensi++;
                        aww[j] = -1;
                    }
                }
                System.out.println(aww[i] + " Muncul Sebanyak " + frekuensi + " Kali");
            }
        }
        kemil.close();
    }
}
