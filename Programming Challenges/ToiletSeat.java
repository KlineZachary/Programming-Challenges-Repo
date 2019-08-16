import java.util.*;
public class ToiletSeat{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        int up = 0, down = 0, preferred = 0;
        for(int i = 1; i < input.length();i++){
            if(input.charAt(i) == 'U') down+=2;
            if(input.charAt(i) == 'D') up+=2;
            if(input.charAt(i) != input.charAt(i - 1)) preferred++;
        }
        
        
        System.out.println(up + ((input.charAt(0) == 'D' ? 1: 0) * (input.charAt(1) == 'D' ? -1: 1)));
        System.out.println(down + ((input.charAt(0) == 'U' ? 1: 0) * (input.charAt(1) == 'U' ? -1: 1)));
        System.out.println(preferred);
    }
}