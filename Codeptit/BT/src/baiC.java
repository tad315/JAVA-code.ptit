import java.util.*;


class Worker{
    private String id;
    private String name;
    private int WorkMinute;

    public Worker(String id, String name, String in, String out){
        this.id = id;
        this.name = name;
        this.WorkMinute = Calc(in, out) - 60;
    }

    private int Calc(String in, String out){
        String[] str = in.split(":");
        String[] str1 = out.split(":");
        int h1 = Integer.parseInt(str[0]); int m1 = Integer.parseInt(str[1]);
        int h2 = Integer.parseInt(str1[0]); int m2 = Integer.parseInt(str1[1]);
        return (h2 * 60 + m2) - (h1 * 60 + m1);
    }

    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getWorkMinute(){
        return this.WorkMinute;
    }
    public String GetStatus(){
        return WorkMinute >= 480 ? "DU" : "THIEU";
    }
    @Override
    public String toString(){
        int h = WorkMinute/60;
        int m = WorkMinute%60;
        return String.format("%s %s %d gio %d phut %s",id, name,  h, m, GetStatus());
    }
}


public class baiC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Worker> workers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String id =  sc.nextLine();
            String name =  sc.nextLine();
            String in = sc.nextLine();
            String out = sc.nextLine();
            workers.add(new Worker(id, name, in, out));
        }

        workers.sort((a, b) ->{
            if(b.getWorkMinute() != a.getWorkMinute()){
                return b.getWorkMinute() - a.getWorkMinute();
            }
            return a.getId().compareTo(b.getId());
        });

        for (Worker w : workers) {
            System.out.println(w);
        }
    }
}