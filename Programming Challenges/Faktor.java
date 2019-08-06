import java.util.*;
public class Faktor{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int published = keyboard.nextInt(), factor = keyboard.nextInt();
        System.out.println(published * (factor - 1) + 1);
    }
}