import java.util.*;
import java.io.*;
public class arealchall{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        double area = keyboard.nextDouble(), length = Math.sqrt(area), perimeter = 4*length;
        System.out.println(perimeter);
    }
}