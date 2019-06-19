import java.util.*;
import java.io.*;
public class Tetration{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        double input = keyboard.nextDouble();
        System.out.printf("%.6f", Math.pow(input, 1 / input));
    }
}