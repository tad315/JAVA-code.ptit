import java.io.*;
import java.util.*;

public class J07005 {
    public static void main(String[] args) throws Exception {
        DataInputStream din = new DataInputStream(new FileInputStream("DATA.IN"));
        TreeMap<Integer,Integer> freq = new TreeMap<>();
        try {
            for (int i = 0; i < 100000; ++i) {
                int x = din.readInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
        } finally {
            din.close();
        }

        for (Map.Entry<Integer,Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}