import java.util.*;

public class TextEncryption {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            int num = keyboard.nextInt();
            if (num == 0)
                break;
            keyboard.nextLine();
            String line = keyboard.nextLine();
            line = line.replaceAll(" ", "").toUpperCase();
            char[] output = new char[line.length()];
            int nextSpot = 0;
            for (int i = 0, j = 0; i < line.length(); i++, j += num) {
                char letter = line.charAt(i);
                if (j >= line.length())j = ++nextSpot;
                output[j] = letter;
            }
            for (char letter : output) {
                System.out.print(letter);
            }
            System.out.println();
        }

    }
}