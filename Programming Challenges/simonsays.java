import java.util.*;

public class Simonsays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();
        for (int i = 0; i < cases; i++) {
            String line = keyboard.nextLine();
            System.out.println(line);
            if (line.startsWith("simon says"))System.out.println(line.substring(11));
        }
    }
}