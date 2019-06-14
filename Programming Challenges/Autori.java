import java.util.*;
import java.io.*;
public class Autori {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		StringBuilder input = new StringBuilder(keyboard.next());
		for(int i = 0; i < input.length();i++) {
			char letter = input.charAt(i);
			if (Character.isUpperCase(letter)) System.out.print(letter);
		}
	}
}
