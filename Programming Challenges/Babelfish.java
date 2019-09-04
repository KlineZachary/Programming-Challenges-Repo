
import java.util.*;
public class Babelfish {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        HashMap<String, String> dict = new HashMap<String,String>();
        String line;
        while(!(line = keyboard.nextLine()).isEmpty()) {
            String[] words = line.split(" ");
            dict.put(words[1], words[0]);
        }
        while(keyboard.hasNext()){
            String translate = keyboard.next();
            if (dict.containsKey(translate)) System.out.println(dict.get(translate));
            else System.out.println("eh");
        }
    }
}
