import java.math.BigInteger;
import java.util.*;
public class AnotherCandies{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int testCases = keyboard.nextInt();
        for(int i = 0; i< testCases; i++){
            long numStudents = keyboard.nextLong();
            long sum = 0;
            for(int j = 0; j < numStudents;j++){
                sum = ((sum%numStudents) + (keyboard.nextLong() %numStudents)) % numStudents;
            }
            if(sum == 0) System.out.println("YES");
            else System.out.println("NO");
        
        }
        
    }
}