package J07034;
import java.io.*;
import java.util.*;

public class J07034 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<MonHoc> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String id =  sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            int TinChi = Integer.parseInt(sc.nextLine().trim());
            list.add(new MonHoc(id, ten, TinChi));
        }
        sc.close();
        Collections.sort(list, Comparator.comparing(MonHoc::getTen));
        for(MonHoc m : list) {
            System.out.println(m);
        }
    }
}
