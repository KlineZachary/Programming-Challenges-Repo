import java.util.*;

public class Doorman {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int maxDifference = keyboard.nextInt(), men = 0, women = 0, matches = 0;
        keyboard.nextLine();
        StringBuilder genders = new StringBuilder(keyboard.nextLine());
        for (int i = 0; i < genders.length(); i++) {
            if (genders.charAt(i) == 'M') men++;
            else women++;

            if (Math.abs(men - women) > maxDifference){
                if ((i != genders.length() - 1) && ((genders.charAt(i) != genders.charAt(i+1)))) {
                    // Do the swapping
                    char current = genders.charAt(i);
                    char nextChar = genders.charAt(i + 1);

                    if (genders.charAt(i) == 'M') {
                        men--;
                        women++;
                    } else {
                        men++;
                        women--;
                    }
                    genders.setCharAt(i, nextChar);
                    genders.setCharAt(i + 1, current);
                    
                }else{
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(genders.length());
    }
}