import java.util.*;
import java.io.*;
public class DetailedDifferences{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numCases = keyboard.nextInt();
        int i = 0;
        StringBuilder output = new StringBuilder("");
        while(i<numCases){
            StringBuilder symbols = new StringBuilder("");
            String lineOne = keyboard.next();
            output.append(lineOne + "\n");
            String lineTwo = keyboard.next();
            output.append(lineTwo + "\n");
            for(int j = 0; j < lineOne.length();j++){
                if(lineOne.charAt(j) == lineTwo.charAt(j)) {symbols.append(".");}
                else{symbols.append("*");}
            }
            output.append(symbols + "\n\n");
            i++;
        }
        System.out.println(output.toString()); 
    }
}