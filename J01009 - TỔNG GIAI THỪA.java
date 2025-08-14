import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        long fact = 1;
        for (long i = 1; i <= n; ++i){
            fact *= i;
            sum += fact;
        }
        System.out.print(sum);
        sc.close();
    }
}
