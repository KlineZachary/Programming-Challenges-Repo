import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Pot {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int num = keyboard.nextInt();
		int sum = 0;
		for(int i = 0;i< num; i++) {
			String line = keyboard.next();
			int number = Integer.parseInt(line.substring(0, line.length() - 1));
			int root = Integer.parseInt(line.substring(line.length() - 1));
			sum  += (Math.pow(number, root));
		}		
		System.out.println(sum);
	}
}
