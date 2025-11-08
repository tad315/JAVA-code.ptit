import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) throws FileNotFoundException{
        File tile = new File("Hello.txt");
        Scanner sc = new Scanner(tile);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
