import java.io.*;
import java.util.*;

public class J07006 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream ("DATA.in"));
            ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
            in.close();
            Map<Integer, Integer> freq = new TreeMap<>();
            for (int x : list) {
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }
            for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
