import java.util.*;
public class simonsays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();
        keyboard.nextLine();
        
        for(int i = 0;i<cases;i++){
            String line = keyboard.nextLine();
            if(line.startsWith("simon says ")) System.out.println(line.substring(10));
            else System.out.println();
        }    
    }
}