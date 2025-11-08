import java.util.*;
import java.io.*;

public class baiC {
    public static void main (String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream (new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> ds = (ArrayList<Integer>) ois.readObject();
        ois.close();
        TreeSet<Integer> res = new TreeSet<>();
        for (int x : ds) {
            if (x >= 100 && tn(x)) {
                res.add(x);
            }
        }
        for (int x : res) System.out.println(x);
    }
    public static boolean tn(int x) {
        String s = String.valueOf(x);
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            ++l; --r;
        }
        return true;
    }
}
