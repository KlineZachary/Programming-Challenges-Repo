import java.util.*;
public class ToLower{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int p = keyboard.nextInt(), t = keyboard.nextInt(), inc = 0;
       
        for(int i = 0; i < p; i++){
            boolean didFail = false;
            for(int j = 0; j < t;j++){
                String word = keyboard.next();
                for(int k = 1; k<word.length();k++){
                    if((Character.isUpperCase(word.charAt(k)))) didFail = true;
                }
            }
            if(!didFail) inc++;
        }
        System.out.println(inc);
    }
}