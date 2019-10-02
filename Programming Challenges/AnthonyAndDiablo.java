import java.util.*;
import java.io.*;
public class AnthonyAndDiablo{
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = keyboard.readLine().split(" ");
        double exactArea = Double.parseDouble(numbers[0]), metersOfFencing = Double.parseDouble(numbers[1]), radius = metersOfFencing / (2 * Math.PI), area = Math.PI * (Math.pow(radius, 2));
        if(area >= exactArea) System.out.println("Diablo is happy!");
        else System.out.println("Need more materials!");
    }
}