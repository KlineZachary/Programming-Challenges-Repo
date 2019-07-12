import java.util.*;
import java.io.*;
public class PaulEigon{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long n = keyboard.nextLong();
        if(((keyboard.nextLong()+keyboard.nextLong())/n)%2 == 0){System.out.println("paul");}
        else{System.out.println("opponent");}

        
    }
}