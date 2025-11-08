import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<CN> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String id = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            String timeIn = sc.nextLine().trim();
            String timeOut = sc.nextLine().trim();
            list.add(new CN(id, name, timeIn, timeOut));
        }
        Collections.sort(list);
        for (CN cn : list) {
            System.out.println(cn);
        }
    }
}