import java.util.*;
import java.io.*;
public class Ladder {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int height = keyboard.nextInt();
        double angle = Math.toRadians(keyboard.nextDouble());
        double heightLadder = (height / Math.sin(angle));
        System.out.println((int) Math.ceil(heightLadder));
	}

}