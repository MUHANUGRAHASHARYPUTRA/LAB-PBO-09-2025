package Tugas_Praktikum_1;
import java.util.Scanner;
public class TP1_3_H071241058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tanggal : ");
        try{
            String input = scanner.nextLine();
            String hasil = formatTanggal(input);
            System.out.println(hasil);
            scanner.close();
        } catch (Exception e){
            System.out.println("Inputan harus berupa angka");
        }
    }
    public static String formatTanggal(String tanggal) {
        String[] angka = tanggal.split("-");
        if (angka.length != 3) {
            return "Format salah";
        }
        int hari = Integer.parseInt(angka[0]);
        int bulan = Integer.parseInt(angka[1]);
        int tahun = Integer.parseInt(angka[2]);
        if (tahun >= 0 && tahun <= 49){
            tahun += 2000;
        } else {
            tahun += 1900;
        }
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        if (bulan < 1 || bulan > 12) {
            return "Bulan tidak valid";
        }
         return hari + " " + namaBulan[bulan-1] + " " + tahun;
    }
}
