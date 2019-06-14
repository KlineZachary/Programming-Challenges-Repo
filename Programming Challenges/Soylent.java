import java.util.*;
import java.io.*;
public class Soylent{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = keyboard.nextInt();
        int i = 0;
        while(i<n){
            int input = keyboard.nextInt();
            if ((input % 400) == 0) {System.out.println(input / 400);}
            else{System.out.println((int)(Math.ceil( (double)(input) / (double)(400))));}
            i++;
        }


        
    }
}