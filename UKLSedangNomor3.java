package UKLSedangKelas10;

import java.util.Random;
import java.util.Scanner;

public class UKLSedangNomor3 {
    public static void main(String[] args) {
        Scanner kemil = new Scanner(System.in);
        Random random = new Random();
        
        String[] operators = {"+", "*", "/", "%"};
        boolean terus = true;

        System.out.println("Kuis Matematika");
        
        while (terus) {
            
            int bil1 = random.nextInt(10) + 1;
            int bil2 = random.nextInt(10) + 1;
            String operator = operators[random.nextInt(operators.length)];
            
            System.out.print("Berapa Hasil Dari " + bil1 + " " + operator + " " + bil2 + " = ");
            double jawabanUser = kemil.nextDouble();

            double jawabanBenar = 0;
            switch (operator) {
                case "+":
                    jawabanBenar = bil1 + bil2;
                    break;
                case "*":
                    jawabanBenar = bil1 * bil2;
                    break;
                case "/":
                    if (bil2 != 0) {
                        jawabanBenar = (double) bil1 / bil2;
                    } else {
                        System.out.println("Pembagian Dengan 0 Tidak Bisa Dilakukan.");
                        continue;
                    }
                    break;
                case "%":
                    jawabanBenar = bil1 % bil2;
                    break;
            }

            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawaban Anda Benar!");
            } else {
                System.out.println("Jawaban Anda Salah. Yang Benar Adalah: " + jawabanBenar);
            }

            System.out.print("Apakah Anda Ingin Melanjutkan Kuis? (ya/tidak): ");
            String input = kemil.next();
            if (input.equalsIgnoreCase("tidak")) {
                terus = false;
                System.out.println("Terima kasih telah bermain!");
            }
        }

        kemil.close();
    }
}
