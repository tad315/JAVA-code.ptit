package baiJ;
import java.io.*;
import java.util.*;

public class baiJ {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> list = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        while(sc.hasNextLine()) {
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            String hinhThuc = sc.nextLine().trim();
            if(!seen.contains(ma)) {
                seen.add(ma);
                list.add(new MonHoc(ma, ten, hinhThuc));
            }
            Collections.sort(list, new Comparator<MonHoc>() {
                public int compare(MonHoc s1, MonHoc s2) {
                    return s1.getMa().compareTo(s2.getMa());
                }
            });
            for(MonHoc m: list){
                System.out.println(m);
            }
        }
    }
}
