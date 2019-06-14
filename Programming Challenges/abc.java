import java.util.*;
import java.io.*;
public class abc{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numOne = keyboard.nextInt(),numTwo = keyboard.nextInt(),numThree = keyboard.nextInt();
        String line = keyboard.next();
        int[] array = {numOne,numTwo,numThree};
        Arrays.sort(array);
        for(int i = 0; i < line.length();i++){
            if(line.charAt(i) == 'A'){System.out.print(array[0] + " ");}
            else if(line.charAt(i) == 'B'){System.out.print(array[1]+ " ");}
            else if(line.charAt(i) == 'C'){System.out.print(array[2]+ " ");}
        }
    }
}