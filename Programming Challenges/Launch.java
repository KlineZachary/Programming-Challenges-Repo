import java.util.*;
import java.io.*;
public class Launch {
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int numDays = k.nextInt(),minNum = Integer.MAX_VALUE, index = 0;
        for(int i = 0;i<numDays;i++){
            int numTrash = k.nextInt();
            if(numTrash < minNum){
                minNum = numTrash;
                index = i;
            }
        }
        System.out.println(index);
    }
}