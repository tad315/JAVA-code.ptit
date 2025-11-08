import java.util.*;

public class baiB {
    public static String chuanHoa(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine().trim());
        while(t-- > 0) {
            int type = Integer.parseInt(sc.nextLine().trim());
            String name = sc.nextLine().trim();
            String[] ps = name.toLowerCase().split("\\s+");
            for (int i = 0; i < ps.length; ++i) {
                ps[i] = chuanHoa(ps[i]);
            }
            if (type == 1) {
                System.out.print(ps[ps.length - 1]);
                for (int i = 0; i < ps.length - 1; ++i) {
                    System.out.print(" " + ps[i]);
                }
            }
            else if (type == 2){
                for (int i = 1; i < ps.length; ++i) {
                    System.out.print(ps[i] + " ");
                }
                System.out.print(ps[0]);
            }
            System.out.println();
        }
    }    
}
