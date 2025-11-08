import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        ArrayList<User> list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            String line =  sc.nextLine().trim();
            String[] p = line.split("\\s+");
            String userName = p[0];
            String passWord = p[1];
            list.add(new User(userName, passWord));
        }
        int m =  Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < m; ++i) {
            String line = sc.nextLine().trim();
            String[] p = line.split("\\s+");
            String userName = p[0];
            String passWord = p[1];

            for (User u : list) {
                if (u.check(userName, passWord)) {
                    u.increaseSuccessCnt();
                    break;
                }
            }
        }
        for (int i = 0; i < list.size(); ++i) {
            System.out.print(list.get(i).getSuccessCnt());
            if (i < list.size() - 1) System.out.print(" ");
        }
    }
}
