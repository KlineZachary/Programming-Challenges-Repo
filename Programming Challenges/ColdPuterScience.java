import java.util.*;
import java.io.*;
public class ColdPuterScience{
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int num = k.nextInt(),neg = 0;;
        for(int i = 0;i<num;i++){
            int temp = k.nextInt();
            if(temp<0) neg++;
        }
        System.out.println(neg);
    }
}