import java.util.*;
public class Incognito{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int testCases = keyboard.nextInt();
        keyboard.nextLine();

        for(int i = 0; i < testCases; i++){
            int num = keyboard.nextInt(), total = 1;
            keyboard.nextLine();
            ArrayList<String> catagories = new ArrayList<>();
            HashMap<String, Integer> map = new HashMap<>();

            for(int j = 0; j < num;j++){
                String[] words = keyboard.nextLine().split(" ");
                if(map.containsKey(words[1])) map.put(words[1], map.get(words[1]) + 1);
                else {
                    catagories.add(words[1]);
                    map.put(words[1], 2);
                }
            }

            for(int j = 0; j < catagories.size(); j++){
                total *= map.get(catagories.get(j));
            }
            System.out.println(total - 1);
        }
    }
}