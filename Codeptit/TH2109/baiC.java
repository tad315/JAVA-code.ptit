import java.util.*;
import java.io.*;

public class baiC {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(new File ("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine().trim());
        Map<String, Integer> used = new HashMap<>();

        while(t-- > 0) {
            String line =  sc.nextLine().trim().toLowerCase();
            String[] ps = line.split("\\s+");
            String email = ps[ps.length - 1];
            for (int i = 0; i < ps.length - 1; i++) {
                email += ps[i].charAt(0);
            }
            String prefix = email;
            if (!used.containsKey(prefix)) {
                used.put(prefix, 1);
                System.out.println(prefix + "@ptit.edu.vn");
            }
            else {
                int cnt = used.get(prefix) + 1;
                used.put(prefix, cnt);
                System.out.println(prefix + cnt + "@ptit.edu.vn");
            }
        }
    }
}
