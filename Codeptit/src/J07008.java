import java.io.*;
import java.util.*;

public class J07008 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        //Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = sc.nextInt();
        ArrayList<String> res = new ArrayList<>();
        for (int mask = 0; mask < (1 << n); ++mask) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    tmp.add(a[i]);
                }
            }
            if (tmp.size() >= 2 && isInc(tmp)) {
                String s = "";
                for (int i = 0; i < tmp.size(); ++i) {
                    if (i > 0) s += " ";
                    s += tmp.get(i);
                }
                res.add(s);
            }
        }
        Collections.sort(res);
        for (String s : res) System.out.println(s);
    }
    private static boolean isInc(ArrayList<Integer> arr) {
        for (int i = 0; i + 1 < arr.size(); ++i) {
            if (arr.get(i) >= arr.get(i + 1)) return false;
        }
        return true;
    }
}
