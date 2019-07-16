import java.util.*;
import java.io.*;
public class DifferentDistances {
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        while(true){
            double x1 = k.nextDouble();
            if (x1==0.0){break;}
            double y1 = k.nextDouble(),x2 = k.nextDouble(),y2 = k.nextDouble(),p = k.nextDouble();
            System.out.println(Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), 1 / p));
        }
    }
}