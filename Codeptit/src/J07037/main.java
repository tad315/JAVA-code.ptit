package J07037;
import java.io.*;
import java.util.*;

public class main {
    public static void main (String[] args) throws Exception {
        ArrayList<DoanhNghiep> ds = new ArrayList<>();
        try(Scanner sc = new Scanner(new File("DN.in"))) {
            int n = Integer.parseInt(sc.nextLine().trim());
            for (int i = 0; i < n; ++i) {
                String ma = sc.nextLine().trim();
                String ten = sc.nextLine().trim();
                int sl = Integer.parseInt(sc.nextLine().trim());
                ds.add(new DoanhNghiep(ma, ten, sl));
            }
        } catch (Exception e) {

        }
        Collections.sort(ds);
        for (DoanhNghiep x : ds) {
            System.out.println(x);
        }
    }
}
