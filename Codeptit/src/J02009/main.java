package J02009;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        ArrayList<Customer> ds = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            int t = sc.nextInt();
            int d = sc.nextInt();
            ds.add(new Customer(t, d));
        }
        Collections.sort(ds, Comparator.comparingInt(c -> c.arrival));
        long cur = 0;
        for (Customer c : ds) {
            if (c.arrival > cur) {
                cur = c.arrival;
            }
            cur += c.durantion;
        }
        System.out.println(cur);
    }
}
