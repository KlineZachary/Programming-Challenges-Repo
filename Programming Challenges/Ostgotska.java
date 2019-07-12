import java.util.*;
import java.io.*;
public class Ostgotska{
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String line = k.nextLine();
        if (isOstgotska(line)) {System.out.println("dae ae ju traeligt va");}
        else{System.out.println("haer talar vi rikssvenska");}
    }
    public static boolean isOstgotska(String line){
        String[] words = line.split(" ");
        int contains = 0;
        for(int i = 0;i<words.length;i++){
            String word = words[i];
            if (word.contains("ae")) {contains++;}
        }
        double avgContains = (double)contains / words.length;
        if(avgContains >= 0.4) {return true;}
        else{return false;} 
    }
}