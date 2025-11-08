//Doc file NP 2
import java.io.*;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
            ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
            in.close();
            TreeSet<Integer> set = new TreeSet<>();
            for (int x : list) {
                if (x >= 100 && check(x)) set.add(x);
            }
            for (int x : set) System.out.println(x);
    }
    public static boolean check(int x) {
        String s = String.valueOf(x);
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            ++l;
            --r;
        }
        return true;
    }
}
