import java.util.*;
import java.io.*;
public class Parking {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] truckPrices = {0,keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt()};  
        int[] arrivalArray = new int[3];
        int[] deptArray = new int[3];
        int sum = 0;
        int max = 0;
        int i = 0;
        while(i < 3){
            arrivalArray[i] = keyboard.nextInt();
            max = Math.max(max, deptArray[i] = keyboard.nextInt());
            i++;
        }
        for(int j = 1; j <= max; j++){
            int numTrucks = 0;
            for(int k = 0; k < 3;k++){
                if(arrivalArray[k] <= j && deptArray[k] > j) numTrucks++;
            }
            sum += (truckPrices[numTrucks] * numTrucks);
        }
        System.out.println(sum);
    }
}