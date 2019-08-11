import java.util.*;
public class Apax{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();
        char letter = ' ';
        for(int i = 0; i < word.length(); i++) 
            if (word.charAt(i) != letter) {
                System.out.print(word.charAt(i));
                letter = word.charAt(i);
            }
    }
}