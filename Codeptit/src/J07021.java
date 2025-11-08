import java.io.*;
import java.util.*;

public class J07021 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine())
        {
            String line = sc.nextLine().trim();
            if (line.equals("END")) break;
            String[] s = line.trim().split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (String w : s) {
                if (w.length() == 0) continue;
                w = w.toLowerCase();
                sb.append(Character.toUpperCase(w.charAt(0)))
                        .append(w.substring(1))
                        .append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        sc.close();
    }
}
