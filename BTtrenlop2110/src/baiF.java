import java.util.*;

public class baiF {
    public static boolean check(String s){
        for ( int  i = 0 ; i < s.length()-1;  i++){
            char x = s.charAt(i);
            char y = s.charAt(i+1);
            if ( x-'0' > y-'0') return false;

        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        LinkedHashMap<String,Integer> res = new LinkedHashMap<>();
        while(sc.hasNext()){
            String s = sc.next();
            if ( check(s)){
                res.merge(s,1,Integer::sum);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(res.entrySet());
        list.sort((a,b) ->{
            int cmp = Integer.compare(b.getValue(),a.getValue());
            if ( cmp != 0) return cmp;
            return 0;
        });

        for ( Map.Entry<String,Integer> e : list){
            System.out.println(e.getKey() + " " + e.getValue());
        }
        sc.close();
    }
}