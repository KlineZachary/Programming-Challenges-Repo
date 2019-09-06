import java.util.*;
public class GuessTheNumber{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int i = 0, middle = 500, low = 1, high = 1000;
        System.out.println(middle);
        while(i<9){
            String response = keyboard.nextLine();
            if (response == "lower"){
                high = middle;
                middle /= 2;
            }else if(response == "higher"){
                low = middle;
                middle = middle + (middle/2);
            }else break;
            System.out.println(middle);
            i++;
        }
    }
}