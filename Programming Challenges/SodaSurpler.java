import java.util.*;
import java.io.*;
public class SodaSurpler{
    ///NOT DONE
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int start = keyboard.nextInt();
        int found = keyboard.nextInt();
        int require = keyboard.nextInt();
        int total = start + found;
        int answer = 0;
        int drink = total / require;
        System.out.println(drinkSoda(drink,require,answer));
        
    }

    public static int drinkSoda(int drink,int require,int answer){
        if (drink != 0){
            answer += drink;
            drinkSoda(require,total,answer);
        }else{
            return total;
        }
        return 0;
        
        
        


    }
}