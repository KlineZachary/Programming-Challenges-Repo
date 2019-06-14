import java.util.*;
import java.io.*;
public class OneChicken {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numPeople = keyboard.nextInt(), numChicken = keyboard.nextInt();
        int chickenLeft = numChicken - numPeople, chickenNeed = numPeople - numChicken;
        if (numChicken > numPeople) {
            if(chickenLeft == 1){ System.out.println("Dr. Chaz will have " + (1) + " piece of chicken left over!");}
                else{System.out.println("Dr. Chaz will have " + (chickenLeft) + " pieces of chicken left over!");}}
         else {
             if (chickenNeed == 1){System.out.println("Dr. Chaz needs " + (1) + " more piece of chicken!");}
                else{System.out.println("Dr. Chaz needs " + (chickenNeed) + " more pieces of chicken!");}
        }
    }
}