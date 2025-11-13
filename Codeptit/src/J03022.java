import java.util.*;
import java.io.*;

public class J03022 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (sc.hasNextLine()) {
            sb.append(sc.nextLine()).append(" ");
        }
        String text = sb.toString();
        String[] parts = text.split("[.?!]");

        for (String s : parts) {
            s = s.trim();
            if (s.isEmpty()) continue;
            if (!s.matches(".*[A-Za-z0-9].*")) continue;
            s = s.replaceAll("\\s+", " ");
            s = s.toLowerCase();
            s = Character.toUpperCase(s.charAt(0)) + s.substring(1);

            System.out.println(s);
        }
    }
}
