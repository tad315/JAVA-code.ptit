//So khong giam
import java.io.*;
import java.util.*;

public class Bai2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream (new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream (new FileInputStream("DATA2.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>) in2.readObject();
        in1.close();
        in2.close();
        int[] freq1 = new int[10001];
        int[] freq2 = new int[10001];
        for (int x : list1) {
            if (x < 9999) ++freq1[x];
        }
        for (int x : list2) {
            if (x < 9999) ++freq2[x];
        }
        for (int x = 10; x <= 9999; ++x) {
            if (freq1[x] > 0 && freq2[x] > 0 && check(x)) {
                System.out.println(x + " " + freq1[x] + " " + freq2[x]);
            }
        }

    }
    public static boolean check(int x) {
        if (x < 10) return false;
        String s = String.valueOf(x);
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) < s.charAt(i - 1)) return false;
        }
        return true;
    }
}
