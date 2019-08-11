import java.util.*;
public class Doorman{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int maxDifference = keyboard.nextInt(), men = 0, women = 0, matches = 0;
        keyboard.nextLine();
        StringBuilder line = new StringBuilder(keyboard.nextLine());
        for(int i = 0; i < line.length();i++){
            if(genders.charAt(i) == 'M') men++;
            else women++;

            if(Math.abs(men-women) < maxDifference) matches++;
            else{
                for()
            }
        }

        System.out.println(matches);
    }
}