import java.util.Scanner;
public class TP1_4_H071241032 {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        long inputan =x.nextInt();
        x.close();
        System.out.println(factorial(inputan));
    }
    public static long factorial(long n){ 

        return n == 0 ? 1 : n * factorial(n-1); 
    }
}
