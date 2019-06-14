import java.util.*;
import java.io.*;
public class Ahh{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String allowed = keyboard.next();
        String doctor = keyboard.next();
        if(allowed.length() >= doctor.length()) {System.out.println("go");}
        else{System.out.println("no");}
    }
}