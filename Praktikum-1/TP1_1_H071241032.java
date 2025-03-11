import java.util.Scanner;
public class TP1_1_H071241032 {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.print("Masukkan judul film: ");
        String judul =x.nextLine();
        String[] kecil =judul.toLowerCase().split(" ");
        StringBuilder simpan = new StringBuilder();
        for(String k : kecil){
            simpan.append(k.substring(0,1).toUpperCase());
            simpan.append(k.substring( 1));
            simpan.append(" ");
            
        }
        System.out.println(simpan);
        System.out.println(kecil);
        x.close();
    }          
}
