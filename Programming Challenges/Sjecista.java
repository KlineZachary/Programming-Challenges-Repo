import java.util.*;
import java.io.*;
public class Sjecista{
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long v = k.nextLong();
        System.out.println((v - 3) * (v - 2) * (v - 1) * (v) / 24); 
    }
}