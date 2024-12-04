package UKLMudahKelas10;

public class UKLMudahNomor3 {
public static void main(String[] args) {
    for(int Angka = 50; Angka > 1; Angka--) {
        if (Angka % 3 == 0){
            System.out.println(Angka + ". saya angkatan 33");
        }else if (Angka % 2 == 0){
            System.out.println(Angka + ". saya anak moklet");
        }else{
            System.out.println(Angka + ". saya anak wikusama");
        }
    }
    System.out.println("1. saya senang");
}

}
