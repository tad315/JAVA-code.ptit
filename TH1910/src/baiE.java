import java.io.*;
import java.util.*;

public class baiE {
    public static boolean isNonDec(int x) {
        String s = String.valueOf(x);
        if (s.length() < 2) return false;
        for (int i = 0; i < s.length() - 1; ++i) {
            if (s.charAt(i) > s.charAt(i + 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> ds1 = (ArrayList<Integer>) ois.readObject();
        ois = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> ds2 = (ArrayList<Integer>) ois.readObject();
        ois.close();
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int x : ds1) {
            if (isNonDec(x)) map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int x : ds2) {
            if (isNonDec(x)) map2.put(x, map2.getOrDefault(x, 0) + 1);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (int x : map1.keySet()) {
            if (map2.containsKey(x)) {
                set.add(x);
            }
        }
        for (int x : set) {
            System.out.println(x + " " + map1.get(x) + " " + map2.get(x));
        }
    }

}
