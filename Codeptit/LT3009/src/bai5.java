import java.io.*;
import java.util.*;

public class bai5 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream in = new ObjectInputStream (new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        in.close();
        TreeSet<Integer> nums = new TreeSet<>();
        for (String s : a) {
            Scanner sc = new Scanner(s);
            while (sc.hasNext()) {
                try {
                    String tmp = sc.next();
                    int x = Integer.parseInt(tmp);
                    nums.add(x);
                }
                catch (NumberFormatException e) {

                }
            }
            for (int x : nums) System.out.println(x);
        }
    }
}
