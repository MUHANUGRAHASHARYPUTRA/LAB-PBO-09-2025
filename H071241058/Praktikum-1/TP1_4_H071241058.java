package Tugas_Praktikum_1;

import java.util.Scanner;

public class TP1_4_H071241058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        try {
            int n = scanner.nextInt();
            int hasil = 1; 
            if (n == 0 || n ==1) {
                  hasil += 1;
            } else {
            for (int i = 1; i <= n; i++){
                hasil *= i;
            }
        }
        System.out.print(hasil);
        } catch (Exception e) {
            System.out.println("Masukkan angka yang benar");
        }
    }
}
