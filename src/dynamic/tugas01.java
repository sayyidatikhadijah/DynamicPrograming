
package dynamic;
import java.util.Scanner;
public class tugas01 {
    public static void TampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
    }
  public static void main(String[] args)
    {
        String identitas = "Sayyidati Khadijah / X RPL 2 / 32";
        TampilJudul(identitas);
        System.out.println("    ");
    }
  {
        //input
        int [] nominal = {5000, 2000, 1000, 500, 100};
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah uang: ");
        int uang = scan.nextInt();
    
  {    
        for(int i = 0; i < 5; i++)
        {
            int jumlah = uang / nominal[i];
            uang = uang - (nominal[i] * jumlah);
            
            System.out.println("lembar" + nominal[i] + "=" + jumlah);
        }
                
    }
}
}



