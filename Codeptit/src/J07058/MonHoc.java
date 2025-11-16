package J07058;
import java.util.*;
import java.io.*;

public class MonHoc implements Comparable<MonHoc>{
    String ma, ten, ht;
    public MonHoc(String ma, String ten, String ht) {
        this.ma = ma;
        this.ten = ten;
        this.ht = ht;
    }
    public int compareTo(MonHoc o) {
        return this.ma.compareTo(o.ma);
    }
    public String toString() {
        return ma + " " + ten + " " + ht;
    }
}
