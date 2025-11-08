import java.util.*;

public class baiA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> setA = new TreeSet<>();
        Set<Integer> setB = new TreeSet<>();

        for (int i = 0; i < n; ++i) setA.add(sc.nextInt());
        for (int i = 0; i < m; ++i) setB.add(sc.nextInt());
        
        Set<Integer> Giao = new TreeSet<>(setA);
        Giao.retainAll(setB);

        Set<Integer> truB = new TreeSet<>(setA);
        truB.removeAll(setB);

        Set<Integer> truA = new TreeSet<>(setB);
        truA.removeAll(setA);
        
        for (int x : Giao) System.out.print(x + " ");
        System.out.println(); 
        for (int x : truB) System.out.print(x + " ");
        System.out.println();
        for (int x : truA) System.out.print(x + " ");
        System.out.println();
        sc.close();
    }
}
