import java.util.Scanner;
public class TP1_3_H071240132 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String inputan = x.nextLine();
        String[] kata = inputan.split("-");
        String[] bulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        int hari = Integer.parseInt(kata[0]);
        int bulan1 = Integer.parseInt(kata[1]);
        int tahun = Integer.parseInt(kata[2]);
        if (tahun <= 25) {
            tahun += 2000;
        } else {
            tahun += 1900;
        }
        System.out.println(hari + " " + bulan[bulan1 - 1] + " " + tahun);
        x.close();
    }
}