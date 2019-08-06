import java.util.*;
import java.math.BigInteger;
public class Oktalni{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BigInteger binaryNum = keyboard.nextBigInteger(2);
        System.out.println(binaryNum.toString(8));
    }
}