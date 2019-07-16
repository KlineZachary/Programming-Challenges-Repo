import java.util.*;
import java.io.*;
public class NoDuplicates {
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String line = k.nextLine();
        String[] words = line.split(" ");
        if (noRepeat(words)) {System.out.println("yes");}
        else {System.out.println("no");}
    }

    public static boolean noRepeat(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = i + 1; j < words.length; j++) {
                String anotherWord = words[j];
                if (word.equals(anotherWord)) {
                    return false;
                }
            }
        }
        return true;
    }
}