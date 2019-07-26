import java.util.*;
import java.io.*;
public class oddities{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int cases = keyboard.nextInt();
        for(int i = 0; i < cases;i++){
            int num =  keyboard.nextInt();
            if (num % 2 == 0) System.out.println(num + " is even");
            else System.out.println(num + " is odd");
        }
    }
}