import java.util.*;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while (t-- > 0) {
            String s1 =  sc.nextLine().trim();
            String s2 =  sc.nextLine().trim();
            Set<String> set1 = new HashSet<>(Arrays.asList(s1.split("\\s+")));
            Set<String> set2 = new HashSet<>(Arrays.asList(s2.split("\\s+")));
            ArrayList<String> res = new ArrayList<>();
            for (String w : set1) {
                if (!set2.contains(w)) res.add(w);
            }
            Collections.sort(res);
            for (String w : res) {
                System.out.print(w + " ");
            }
            System.out.println();
        }
    }
}

