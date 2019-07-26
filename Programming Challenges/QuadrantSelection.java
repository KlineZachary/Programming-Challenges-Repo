import java.util.*;
import java.io.*;
public class QuadrantSelection{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int x = keyboard.nextInt(), y = keyboard.nextInt();
        if( (x>0)&&(y>0)) System.out.println(1);
        else if( (x<0)&&(y>0)) System.out.println(2);
        else if( (x<0)&&(y<0)) System.out.println(3);
        else System.out.println(4);
    }
}