import java.util.*;
public class Hissing{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.next();
        boolean isHiss = false;
        for(int i = 0; i < word.length() - 1; i++){
            if(word.charAt(i) == 's' && word.charAt(i+1) == 's') isHiss = true;
        }
        if (isHiss) System.out.println("hiss");
        else System.out.println("no hiss");
    }
}