import java.util.*;
import java.io.*;
public class QuickEstimates{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = keyboard.nextInt();
        int i = 0;
        while(i < n){
            String number = keyboard.next();
            int digits = 0;
            for(int j = 0; j < number.length(); j++){
                digits++;
            }
            System.out.println(digits);
            i++;
        }
    }

}