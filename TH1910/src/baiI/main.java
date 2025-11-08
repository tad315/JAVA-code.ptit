package baiI;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CN> ds = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String in = sc.nextLine().trim();
            String out = sc.nextLine().trim();
            ds.add(new CN(ma, ten, in, out));
        }
        Collections.sort(ds);
        for(CN x : ds) System.out.println(x);
    }
}
