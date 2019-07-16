import java.util.*;
import java.io.*;
public class FizzBuzz{
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x = k.nextInt(),y = k.nextInt(),n = k.nextInt();
        for(int i = 1;i<=n;i++){
            if(i % x == 0 && i % y == 0){System.out.println("FizzBuzz");}
            else if(i % y == 0) System.out.println("Buzz");
            else if(i % x == 0) System.out.println("Fizz");
            else{System.out.println(i);}
        }
    }
}