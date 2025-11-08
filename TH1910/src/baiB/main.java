package baiB;
import java.util.*;
import java.text.*;

public class main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        Map<String, Theloai> TL = new HashMap<>();
        for (int i = 1; i <= n; ++i) {
            String name = sc.nextLine().trim();
            String id = String.format("TL%03d", i);
            TL.put(id, new Theloai(id, name));
        }
        ArrayList<Phim> ds = new ArrayList<>();
        for (int i = 1; i <= m; ++i) {
            String maTL = sc.nextLine().trim();
            String d = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            int soTap = Integer.parseInt(sc.nextLine().trim());
            String maP = String.format("P%03d", i);
            ds.add(new Phim(maP, TL.get(maTL), d, ten, soTap));
        }
        Collections.sort(ds);

        for (Phim s : ds) {
            System.out.println(s);
        }
    }
}
