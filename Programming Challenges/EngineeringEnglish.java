import java.util.*;
import java.io.*;
public class EngineeringEnglish{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        HashSet<String> words = new HashSet<>();
        while (keyboard.hasNextLine()) {
            for (String s : keyboard.nextLine().split(" "))
                if (words.contains(s.toLowerCase())) System.out.print(". ");
                else {
                    System.out.print(s + " ");
                    words.add(s.toLowerCase());
                }
            System.out.println();
        }
    }
}