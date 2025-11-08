package J04006;
import java.util.Scanner;

public class Sv {
    private String MSV;
    private String ten;
    private String lop;
    private String ngaySinh;
    private float gpa;

    public Sv(){
        this.MSV = "";
        this.ten = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0;
    }

    public void nhap(Scanner sc) {
        this.MSV = "B20DCCN001";
        this.ten = sc.nextLine().trim();
        this.lop = sc.nextLine().trim();
        this.ngaySinh = sc.nextLine().trim();
        this.gpa = Float.parseFloat(sc.nextLine().trim());
        chuanHoa();
    }

    public void chuanHoa() {
        StringBuilder sb = new StringBuilder(this.ngaySinh);
        if (sb.charAt(1) == '/') sb.insert(0, "0");
        if (sb.charAt(4) == '/') sb.insert(3, "0");
        this.ngaySinh = sb.toString();
    }

    public String toString() {
        return MSV + " " + ten + " " + lop + " " + ngaySinh + " " + String.format("%.2f", gpa);
    }
}
