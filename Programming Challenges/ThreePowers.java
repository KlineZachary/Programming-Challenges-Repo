import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class ThreePowers{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        BigInteger input = BigInteger.ONE;

        while((input = keyboard.nextBigInteger()).compareTo(BigInteger.ZERO) != 0){
            input = input.subtract(BigInteger.ONE);
            BigInteger bitScanner = BigInteger.ONE;
            BigInteger powerThree = BigInteger.ONE;
            int count = input.bitCount();
            System.out.print("{ ");

            for(int i = 0; i < 64;i++){
                if((bitScanner.and(input)).compareTo(BigInteger.ZERO) != 0) System.out.print(powerThree + (--count > 0 ? ", " : ""));
                bitScanner = bitScanner.shiftLeft(1);
                powerThree = powerThree.multiply(new BigInteger("3"));
                
            }
            System.out.println(" }");
        }
    }
}