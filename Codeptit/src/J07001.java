import java.io.*;
import java.util.*;

public class J07001 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
}
