package Tugas_Praktikum_1;
import java.util.Random;
import java.util.Scanner;
public class TP1_2_H071241058 {
    public static void main(String[] args) {
        int[][] nums = new int[3][3]; 
        Random rand = new Random();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = rand.nextInt(10) + 1; 
            }
        }

        System.out.println("Array 2D:");
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari: ");

        try {
            int target = scanner.nextInt();
            boolean ditemukan = false;

            System.out.println("Hasil pencarian:");
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == target) {
                        System.out.println("Found " + target + " at [" + i + "][" + j + "]");
                        ditemukan = true;
                    }
                }
            }

            if (!ditemukan) {
                System.out.println("Angka tidak ditemukan.");
            }

        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan bulat.");
        } finally {
            scanner.close();
        }
    }
}