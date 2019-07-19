import java.util.*;
import java.io.*;
public class LastFactorial{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numCases = keyboard.nextInt();
        for(int i = 0; i<numCases;i++){
            System.out.println(getFactorial(keyboard.nextInt()) % 10);
        }

    }
    public static int getFactorial(int num){
        if (num == 0)  return 1;    
        else return(num * getFactorial(num-1));    
    }
}