package baiK;

import java.util.*;
import java.io.*;

public class main {
    public static void main(String[] args) throws Exception {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int nMon = Integer.parseInt(sc1.nextLine().trim());
        for (int i = 0; i < nMon; i++) sc1.nextLine();
        sc1.close();
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        int nGV = Integer.parseInt(sc2.nextLine().trim());
        ArrayList<GiangVien> dsGV = new ArrayList<>();
        for (int i = 0; i < nGV; i++) dsGV.add(new GiangVien(sc2.nextLine()));
        sc2.close();
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        int nLop = Integer.parseInt(sc3.nextLine().trim());
        for (int i = 0; i < nLop; i++) {
            String[] parts = sc3.nextLine().split("\\s+");
            String maGV = parts[0];
            double gio = Double.parseDouble(parts[2]);
            for (GiangVien gv : dsGV) {
                if (gv.match(maGV)) {
                    gv.tongGio += gio;
                    break;
                }
            }
        }
        sc3.close();
        for (GiangVien gv : dsGV) System.out.println(gv);
    }
}