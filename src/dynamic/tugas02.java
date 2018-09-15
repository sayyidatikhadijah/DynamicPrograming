
package dynamic;
import java.util.Scanner;

public class tugas02 {
     public static void TampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
    }
  public static void main(String[] args)
    {
        String identitas = "Sayyidati Khadijah / X RPL 2 / 32";
        TampilJudul(identitas);
        System.out.println("    ");
        
    {
         Scanner sistem = new Scanner(System.in);
        int arr[]= {7, 5, 4, 3, 2};
        int arr1[]= {10000, 7000, 5000, 3000, 2000};
        int bayaran = 0;
        
        System.out.print("Jumlah berat maksimal : ");
        int n = sistem.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
            int hasil =  n / arr[i];
            n = n - (arr[i] * hasil);
            bayaran += hasil * arr1[i];
        }
        System.out.println("Bayaran yang didapat : " + bayaran);
    }
    }
}

