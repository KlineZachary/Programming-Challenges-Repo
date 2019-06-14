import java.util.*;
import java.io.*;
public class Spavanac {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int firstNum = keyboard.nextInt();
        int secondNum = keyboard.nextInt();
        int min = ((firstNum * 60) + secondNum) - 45;
        if (min < 0){
            min += (24*60);
        }
        secondNum = min %60;
        firstNum = min / 60;
        System.out.println(firstNum + " " + secondNum);
    }
}