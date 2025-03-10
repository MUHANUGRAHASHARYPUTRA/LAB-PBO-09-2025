package Tugas_Praktikum_1;
import java.util.Scanner;
public class TP1_5_H071241058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Password : ");
        String password = scanner.nextLine();
        if (isValidPassword(password)) {
            System.out.println("Password Valid");
        } else {
            System.out.println("Password tidak valid");
        }
    }
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hurufBesar = false;
        boolean hurufKecil = false;
        boolean angka = false;

        for (int i = 0; i<password.length(); i++) {
            char karakter = password.charAt(i);
            if (karakter >= 'A' && karakter <= 'Z') {
                hurufBesar = true;
            } else if (karakter >= 'a' && karakter <= 'z'){
                hurufKecil = true;
            } else if (karakter >= '0' && karakter <= '9'){
                angka = true;
            }
        }
        return hurufBesar && hurufKecil && angka;
    }
}
