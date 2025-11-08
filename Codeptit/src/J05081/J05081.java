package J05081;
import java.util.*;

public class J05081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String ten = sc.nextLine();
            String donVi = sc.nextLine();
            int giaMua = Integer.parseInt(sc.nextLine());
            int giaBan = Integer.parseInt(sc.nextLine());

            list.add(new MatHang(ten, donVi, giaMua, giaBan));
        }

        Collections.sort(list);

        for (MatHang mh : list) {
            System.out.println(mh);
        }
    }
}
