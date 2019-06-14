import java.util.*;
import java.io.*;
public class ReverseRot {

	public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int shiftNumber = keyboard.nextInt();
        while(shiftNumber > 0){
            StringBuilder reverse = reverseString(keyboard.next());
            for(int i = 0; i < reverse.length(); i++){
                char letter = reverse.charAt(i);
                if (letter == '_') letter = ('Z' + 1);
                if (letter == '.') letter = ('Z' + 2);
                letter += shiftNumber;
                if (letter > 'Z' + 2){letter -= 28;}
                if(letter =='Z' + 1) letter = '_';
                if(letter =='Z' + 2) letter = '.';
                reverse.setCharAt(i, letter);
            }
            System.out.println(reverse.toString());
            shiftNumber = keyboard.nextInt();
        }  
    }
    public static StringBuilder reverseString(String word){
        StringBuilder reverseString = new StringBuilder("");
        for(int i = word.length();i-->0;){
            reverseString.append(word.charAt(i));
        }
        return reverseString;
    }
}