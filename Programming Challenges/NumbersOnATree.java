import java.util.*;
import java.io.*;
public class NumbersOnATree{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();// height
        String path = (scan.hasNext()) ? (scan.next()) : ("");// If no path, set path to ""

        int i = 1;// root starts at 1
        for (int j = 0; j < path.length(); j++)
            i = (i << 1) | (path.charAt(j) == 'L' ? 0 : 1);// Equivalent to: i = 2 * i + (path.charAt(j) == 'L' ? 0 :
                                                           // 1);
        // Left child formula: current_index * 2
        // Right child formula: current_index * 2 + 1
        System.out.println((1 << (h + 1)) - i);
    }

    
}