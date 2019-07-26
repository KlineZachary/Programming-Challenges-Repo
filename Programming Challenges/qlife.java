import java.util.*;
import java.io.*;
public class qlife{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int cases = keyboard.nextInt();
        double sum = 0;
        for(int i = 0; i < cases; i++){
            sum+= (keyboard.nextDouble() * keyboard.nextDouble());
        }
        System.out.println(sum);
    }
}