import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class SimpleAddition{
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            String numOne = keyboard.next(), numTwo = keyboard.next();
            BigInteger bigOne = new BigInteger(numOne), bigTwo = new BigInteger(numTwo);
            System.out.println(bigOne.add(bigTwo).toString());
    }
}