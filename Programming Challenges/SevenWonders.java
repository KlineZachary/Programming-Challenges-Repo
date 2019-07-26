import java.util.*;
import java.io.*;
public class SevenWonders{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String line = keyboard.nextLine();
        int t = 0, c = 0, g = 0;
        for(int i = 0; i<line.length();i++){
            if (line.charAt(i) == 'T') t++;
            else if (line.charAt(i) == 'C') c++;
            else g++;
        }
        System.out.println((t*t) + (c*c) + (g*g) + (7*Math.min(Math.min(t , c) , g)));
    }
}