import java.util.Scanner;
public class TP1_5_H071241032 {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = x.nextLine();
        x.close();
        String cek = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
        if (password.matches(cek)) {
            System.out.println("Password valid");
        }else{
            System.out.println("Password tidak valid");
        }
    }
}
