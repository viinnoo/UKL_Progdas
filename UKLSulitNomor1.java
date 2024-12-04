import java.util.Scanner;

public class UKLSulitNomor1 {

    public static void rumus(int i, int jS) {
        int tN = 0;
        while(i <= jS){
            Scanner a = new Scanner(System.in);
            System.out.println("___________________");
            System.out.println("Masukkan Nilai ke-" + i + ": ");
            int n = a.nextInt();
            tN += n;
            i++;
        }

        int rR = tN / jS;
        System.out.println("_____________________________________________");
        System.out.println("Rata-Rata Nilai Dari " + jS + " Siswa Anda Adalah: " + rR);
    }



    public static void main(String[] args) {
    
    {
        Scanner b = new Scanner(System.in);
        int i = 1;
        int jumlahSiswa;
        double nilai;
        double totalNilai = 0;
        double rataRata;

        System.out.println("Ini Adalah Penghitung Rata Rata Nilai Siswa");
        System.out.println("___________________________________________");
        System.out.println("Masukkan Jumlah Siswa Anda: ");
        System.out.println("____________________________");
        jumlahSiswa = b.nextInt();

        rumus(i, jumlahSiswa);
        

            
    }
}
}

