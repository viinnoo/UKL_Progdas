
public class UKLSulitNomor2 {  
        public static void main(String[] args) {
            int [] angka = {1, 2, 3, 4, 5, 2};
            
            for (int i = 0; i < angka.length; i++) {
                for (int j = i + 1; j < angka.length; j++) {
                    if (angka[i] == angka[j]) {
                        System.out.println("Array memiliki elemen duplikat: " + angka[i]);
                        return;
                }
            }
        }

        System.out.println("Array tidak memiliki elemen duplikat");

    
    }
}           