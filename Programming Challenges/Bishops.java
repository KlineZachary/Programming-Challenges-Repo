import java.util.*;
import java.io.*;
public class Bishops{
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String line = keyboard.readLine();
            if(line == null) break;
            int x = Integer.parseInt(line);
            if (x<=0) System.out.println("0");
            else if(x==1) System.out.println("1");
            else System.out.println((x-1)*2);
        }
    }
}