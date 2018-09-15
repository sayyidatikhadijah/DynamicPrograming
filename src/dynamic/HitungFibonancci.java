
package dynamic;
import java.util.Scanner;
import java.math.BigInteger;

public class HitungFibonancci {
    @SuppressWarnings("empty-statement")
    public static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
        System.out.println("\nHitung Fibonacci");
        System.out.println("l, 1, 2, 3, 5, 8, 13, 21, .,. dst.\n");
    }
    
    public static void main(String[] args)
    {
        String identitas = "Sayyidati Khadijah/ X RPL 2 / 32";
        tampilJudul(identitas);
    }
}
       