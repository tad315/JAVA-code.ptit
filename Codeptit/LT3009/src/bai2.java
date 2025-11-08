import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class bai2 {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner (new File("SONGUYEN.IN"));
        //Scanner sc = new Scanner (System.in);
        int t = Integer.parseInt(sc.nextLine().trim());

        while(t-- >0) {
            String s = sc.nextLine().trim();
            BigInteger n = new BigInteger(s);
            boolean d7 = n.mod(BigInteger.valueOf(7)).equals(BigInteger.ZERO);
            boolean d13 = n.mod(BigInteger.valueOf(13)).equals(BigInteger.ZERO);
            if (d7 && d13) System.out.println("Both");
            else if (d7) System.out.println("Div 7");
            else if (d13) System.out.println("Div 13");
            else System.out.println("None");


        }
    }
}
