import java.io.*;
import java.util.*;

public class baiD {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
            ArrayList<String> list1 = (ArrayList<String>) ois1.readObject();
            ois1.close();

            ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
            ArrayList<Integer> list2 = (ArrayList<Integer>) ois2.readObject();
            ois2.close();

            TreeSet<String> codes = new TreeSet<>();

            for (String s : list1) {
                for (Integer num : list2) {
                    String code = s + String.format("%03d", num);
                    codes.add(code);
                }
            }

            for (String code : codes) {
                System.out.println(code);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
