import java.util.*;
import java.io.*;
public class JobExpenses{
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = k.nextInt(), expen = 0;
        boolean noExpen = true;
        for(int i = 0;i<n;i++){
            int num = k.nextInt();
            if(num < 0){
                expen+=num;
                noExpen = false;
            }
        }
        if(noExpen) {System.out.println("0");}
        else{System.out.println(expen * -1);}
    }
}