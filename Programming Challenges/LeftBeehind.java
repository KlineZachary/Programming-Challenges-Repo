import java.util.*;
import java.io.*;
public class LeftBeehind{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        while(true){
            int sweet = keyboard.nextInt(), sour = keyboard.nextInt();
            if((sweet == 0) && (sour == 0)) break;
            if (sweet + sour == 13) System.out.println("Never speak again.");
            else if (sweet > sour) System.out.println("To the convention.");
            else if (sweet < sour) System.out.println("Left beehind.");
            else System.out.println("Undecided.");
        }
    }
}