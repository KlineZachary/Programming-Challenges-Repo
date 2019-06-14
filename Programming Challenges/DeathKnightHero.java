import java.util.*;
import java.io.*;
public class DeathKnightHero{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = keyboard.nextInt();
        int i = 0;
        int won = n;
        while(i<n){
            String seq = keyboard.next();
            for(int j = 0;j< seq.length();j++){
                if((j != (seq.length() - 1)) &&(seq.charAt(j) == 'C') && (seq.charAt(j + 1) == 'D')){won--;}
            }
            i++;
        }
        System.out.println(won);
    }
}