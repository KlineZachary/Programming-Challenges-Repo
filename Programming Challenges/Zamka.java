import java.util.*;
import java.io.*;
public class Zamka{
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String lineOne = keyboard.readLine(), lineTwo = keyboard.readLine(), lineThree = keyboard.readLine();
        int min = Integer.parseInt(lineOne), max = Integer.parseInt(lineTwo), sumDigits = Integer.parseInt(lineThree);
        int realMin = 0, realMax = 0;
        //find min
        for(int i = min; i <= max;i++){
            String number = "" + i;
            int sum = 0;
            for(int j = 0; j < number.length();j++){
                int digit = Integer.parseInt(number.charAt(j) + "");
                sum+=digit; 
            }
            if(sum == sumDigits) {
                System.out.println(number);
                break;
            }
        }

        //find max
        for(int i = max; i >= min;i--){
            String number = "" + i;
            int sum = 0;
            for(int j = 0; j < number.length();j++){
                int digit = Integer.parseInt(number.charAt(j) + "");
                sum+=digit; 
            }
            if(sum == sumDigits) {
                System.out.println(number);
                break;
            }
        }
    }
}