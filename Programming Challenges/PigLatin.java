import java.util.*;
import java.io.*;
public class PigLatin {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        StringBuilder newSentence = new StringBuilder("");
        while(keyboard.hasNextLine()){
            String line = keyboard.nextLine();
            if(line.isEmpty()) break;
            String[] words = line.split(" ");

            for(String word: words){
                StringBuilder beforeVowel = new StringBuilder("");
                if(word.charAt(0) == 'a' || 
                   word.charAt(0) == 'e' || 
                   word.charAt(0) == 'i' || 
                   word.charAt(0) == 'o' || 
                   word.charAt(0) == 'u' || 
                   word.charAt(0) == 'y') newSentence.append(word + "yay ");
                else{
                    for(int i = 0; i< word.length();i++){
                        if(word.charAt(i) == 'a' || 
                           word.charAt(i) == 'e' || 
                           word.charAt(i) == 'i' || 
                           word.charAt(i) == 'o' || 
                           word.charAt(i) == 'u' || 
                           word.charAt(i) == 'y'){
                               for(int j = i; j< word.length();j++){
                                   newSentence.append(word.charAt(j));
                               }
                               newSentence.append(beforeVowel.toString() + "ay ");
                               break;
                        }else beforeVowel.append(word.charAt(i));
                    }
                }       
            }
            newSentence.append("\n");
        }
        System.out.println(newSentence.toString());
    }
}