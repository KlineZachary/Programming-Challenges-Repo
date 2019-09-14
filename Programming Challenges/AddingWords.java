import java.util.*;
import java.io.*;

public class AddingWords {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<String, Integer> table = new Hashtable<>();
        while (true) {
            String line = keyboard.readLine();
            int sum = 0;
            int sign = 1;
            boolean noGoBro = false;
            String equals = "unknown";
            if (line.equals("clear")) {
                table.clear();
                continue;
            }
            String[] words = line.split(" ");
            if (words[0].equals("def")) {
                if (table.contains(words[1]))
                    table.remove(words[1]);

                table.put(words[1], Integer.parseInt(words[2]));
                continue;
            }

            for (int i = 1; i < words.length - 1; i += 2) {
                String first = words[i], operation = words[i + 1];
                if (!table.containsKey(first)) {
                    noGoBro = true;
                    break;
                }
                sum += table.get(first) * sign;
                sign = operation.equals("-") ? -1 : 1;
            }
            if (!noGoBro) {
                for (String key : table.keySet()) {
                    int value = table.get(key);
                    if (value == sum) {
                        equals = key;
                        break;
                    }
                }
            }
            System.out.println(line.substring(5) + " " + equals);
        }
    }

}