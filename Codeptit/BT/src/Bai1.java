import java.util.*;

class Element {
    int value;
    int freq;
    int firstIndex;

    Element(int value, int freq, int firstIndex) {
        this.value = value;
        this.freq = freq;
        this.firstIndex = firstIndex;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            Map<Integer, Element> map = new HashMap<>();
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (!map.containsKey(arr[i])) {
                    map.put(arr[i], new Element(arr[i], 1, i));
                } else {
                    map.get(arr[i]).freq++;
                }
            }

            ArrayList<Element> list = new ArrayList<>(map.values());

            list.sort((a, b) -> {
                if (b.freq != a.freq) return b.freq - a.freq;
                return a.firstIndex - b.firstIndex;
            });

            StringBuilder sb = new StringBuilder();
            for (Element e : list) {
                for (int i = 0; i < e.freq; i++) {
                    sb.append(e.value).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
        sc.close();
    }
}
