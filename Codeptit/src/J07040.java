import java.io.*;
import java.util.*;

public class J07040 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> a = (ArrayList<String>) ois.readObject();
        ArrayList<String> b = new ArrayList<>();

        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();

        for (String i : a) {
            set1.addAll(Arrays.asList(i.trim().toLowerCase().split("\\s+")));
        }
        while (sc.hasNextLine())
        {
            String s = sc.nextLine().trim().toLowerCase();
            b.addAll(Arrays.asList(s.split("\\s+")));
        }
        for (String i : b)
        {
            if (!set2.contains(i) && set1.contains(i))
            {
                System.out.println(i);
                set2.add(i);
            }
        }
    }
}
