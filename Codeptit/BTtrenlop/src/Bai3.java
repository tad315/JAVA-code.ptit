//Gia tri nhi phan
import java.io.*;
import java.util.*;

public class Bai3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> list = (ArrayList<String>) in.readObject();
        in.close();
        for (String s: list) {
            StringBuilder b = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '0' || c == '1') {
                    b.append(c);
                }
            }
            if (b.length() == 0) System.out.println("0 0");
            else {
                long val = Long.parseLong(b.toString(), 2);
                System.out.println(b.toString() + " " + val);
            }
        }
    }
}
