package J05033;
import java.util.*;

public class J05033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Time> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            list.add(new Time(h, m, s));
        }

        Collections.sort(list);

        for (Time t : list) {
            System.out.println(t);
        }
    }
}
