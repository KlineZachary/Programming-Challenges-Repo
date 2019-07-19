import java.util.*;
import java.io.*;
public class GrassSeed{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        double seedCost = keyboard.nextDouble(), sum = 0.0;
        int numLawns = keyboard.nextInt();
        for(int i = 0;i<numLawns;i++){
            double width = keyboard.nextDouble(),height = keyboard.nextDouble();
            sum+= (width*height) * (seedCost);
        }
        System.out.println(sum);
    }
}