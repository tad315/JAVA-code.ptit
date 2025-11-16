package J07058;
import java.util.*;
import java.io.*;
public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<MonHoc> ds = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String ht = sc.nextLine().trim();
            ds.add(new MonHoc(ma, ten, ht));
        }
        Collections.sort(ds);
        for (MonHoc mh : ds) {
            System.out.println(mh);
        }
    }
}
