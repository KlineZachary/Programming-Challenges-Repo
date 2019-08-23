import java.math.BigInteger;
import java.util.*;
public class Nine{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int testCases = keyboard.nextInt();
        BigInteger nine = new BigInteger("9");
        BigInteger eight = new BigInteger("8");
        BigInteger bigMamma = new BigInteger("1000000007");

        for(int i = 0; i < testCases; i++){
            BigInteger bigLength = keyboard.nextBigInteger();
            BigInteger output = eight.multiply(nine.modPow(bigLength.subtract(BigInteger.ONE), bigMamma));
            System.out.println(output.mod(bigMamma));
        }
    }
}