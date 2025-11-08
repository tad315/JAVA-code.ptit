import java.io.*;
import java.util.*;

public class baiD {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner (new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();
        while(sc.hasNext()) {
            String w = sc.next();
            if (checkDig(w) && check(w)) set.add(w);
        }
        for (String w : set) System.out.println(w);
    }
    public static boolean checkDig(String w) {
        for (char c : w.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }
    public static boolean check(String w) {
        String e = ".,?!:";
        for (char c : w.toCharArray()) {
            if (e.indexOf(c) >= 0) return false;
        }
        return true;
    }
}
