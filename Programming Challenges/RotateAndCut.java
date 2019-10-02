import java.util.*;
import java.io.*;
public class RotateAndCut{
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(keyboard.readLine());
        for(int i = 0; i < cases; i++){
            String[] words = keyboard.readLine().split(" ");
            int numRoateAndCuts = Integer.parseInt(words[0]);
            StringBuilder output = new StringBuilder();
            output.append(words[1]);
            for(int j = 0; j < numRoateAndCuts; j++){
                int fourth = output.length() / 4;
                if(fourth == 0) break;
                if(j % 2 == 0) output.delete(0,fourth);
                else output.delete(output.length() - fourth, output.length());
            }
            System.out.println(output.toString());
        }
    }
}