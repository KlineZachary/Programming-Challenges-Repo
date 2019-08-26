import java.util.*;
public class iBoard{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        while(keyboard.hasNextLine()){
            String line = keyboard.nextLine();
            int ones = 0, zeros = 0;
            for(int i = 0; i < line.length();i++){
                char c = line.charAt(i);
                int b = 0;
                while(b < 7){
                    if((c & 1) == 0) zeros++;
                    else ones++;
                    c >>=1;
                    b++;
                }

            }

            if((zeros % 2 == 0) && (ones % 2 == 0)) System.out.println("free");
            else System.out.println("trapped");
        }
    }
}