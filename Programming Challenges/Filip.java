import java.util.*;
import java.io.*;

public class Filip {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numberOne = reverseNumber(keyboard.nextInt()), numberTwo = reverseNumber(keyboard.nextInt()), result = 0;
        result = numberOne >= numberTwo ? (numberOne) : (numberTwo);
        System.out.println(result);
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}