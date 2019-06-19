import java.util.*;
import java.io.*;
public class Server{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int cases = keyboard.nextInt(), maxTime = keyboard.nextInt(), sum = 0, numWorked = 0;
        for(int i = 0; i < cases;i++){
            int n = keyboard.nextInt();
            if(((sum+n) <= maxTime)){
                sum += n;
                numWorked++;
            }else{break;}
        }
        System.out.println(numWorked);
    }
}