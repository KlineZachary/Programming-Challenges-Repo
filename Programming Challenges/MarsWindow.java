import java.util.*;
import java.io.*;
public class MarsWindow{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int year = keyboard.nextInt();
        int inc = 0;
        if (year == 2018){System.out.println("yes");}
        // else if((year * 12) % 26 == 0){System.out.println("yes");}
        // else {System.out.println("no");}
        else{
            for(int i = 0; i < (year - 2018);i++){
                inc+=12;
            }
        }
        
    }
}