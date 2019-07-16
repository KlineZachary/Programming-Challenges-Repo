import java.util.*;
import java.io.*;
public class Kemija{
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String coded = k.nextLine();
        StringBuilder nonCoded = new StringBuilder("");
        for(int i = 0;i<coded.length();i++){
            char letter = coded.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o'|| letter == 'u'){
                i+=2;
            }
            nonCoded.append(letter);
        }
        System.out.println(nonCoded);
    }

}