import java.util.*;
public class BestCompressionEver{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double numFiles = keyboard.nextDouble(), maxBits = keyboard.nextDouble();
        if(numFiles <= (Math.pow(2.0, maxBits + 1)) - 1) System.out.println("yes");
        else System.out.println("no");
    }
}