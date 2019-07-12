import java.util.*;
import java.io.*;
public class EraseSecurely{
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numSwitch = k.nextInt();
        String before = k.next(), after = k.next();
        boolean didSwitch = true;
        for(int i = 0; i < before.length();i++){
            char numBefore = before.charAt(i);
            char numAfter = after.charAt(i);
            for(int j = 0; j < numSwitch;j++){
                if (numBefore == '1') {numBefore = '0';}
                else{numBefore = '1';}
            }
            if (numBefore!=numAfter){didSwitch = false;}
        }
        if (didSwitch){System.out.println("Deletion succeeded");}
        else{System.out.println("Deletion failed");}
    }
}