import java.util.*;
import java.io.*;
public class CharacterDev{
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(keyboard.readLine());
        System.out.println((int)(Math.pow(2 , num) - num - 1));
    }
}