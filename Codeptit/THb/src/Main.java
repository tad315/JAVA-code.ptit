import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String id = sc.nextLine().trim();
            if (id.equals("")) break;
            String name = sc.nextLine().trim();
            String cls = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            String phone = sc.nextLine().trim();
            list.add(new Students(id, name, cls, email, phone));
        }

        Collections.sort(list, new Comparator<Students>() {
            public int compare(Students a, Students b) {
                if (!a.getCls().equals(b.getCls())) {
                    return a.getCls().compareTo(b.getCls());
                }
                return a.getId().compareTo(b.getId());
            }
        });

        for (Students st : list) {
            System.out.println(st);
        }
    }
}