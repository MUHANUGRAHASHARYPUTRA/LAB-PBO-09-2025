import java.util.Scanner;
public class TP1_2_H071241032 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        try{
            System.out.print("Masukkan angka yang ingin dicari: ");
            int input =x.nextInt();
            x.close();
            int nums[][]={
                {1,2,3},{4,5,6},{7,8,9}
            };
            boolean cek =false;
        for(int i =0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(input == nums[i][j]){
                    System.out.println("Found "+ input +" at "+ "[" + i+"]["+j+"]");
                    cek = true; 
                }
            }
        }
        if(!cek){
            System.out.println("Angka "+input+" Tidak Ditemukan!");
        }
        }catch(NumberFormatException e){
            System.out.println("Inputan harus angka bos");
        }
        
        catch(Exception e){
            System.out.println("Tidak valid");
        }
    }
}
