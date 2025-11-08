import java.util.*;
import java.util.regex.*;
import java.io.*;

public class baiE {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        TreeSet<String> times = new TreeSet<>();

        Pattern p = Pattern.compile("(?<=^|[ \\t\\n,\\.])([0-2][0-9]:[0-5][0-9]:[0-5][0-9])(?=$|[ \\t\\n,\\.])");

        while ((line = br.readLine()) != null) {
            Matcher m = p.matcher(line);
            while (m.find()) {
                String ts = m.group(1);
                int hh = Integer.parseInt(ts.substring(0, 2));
                if (hh <= 23) {
                    times.add(ts);
                }
            }
        }
        br.close();

        for (String t : times) {
            System.out.println(t);
        }
    }
}
