import java.util.*;
import java.io.*;
public class Man{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCases = keyboard.nextInt();
        int[] number = new int[testCases];
        int i = 0;
        while(i < testCases){
            int numberCities = keyboard.nextInt();
            String[] cities = new String[numberCities];
            for(int j = 0; j < numberCities; j++){
                cities[j] = keyboard.next(); 
            }
            i++;
        }
    }
}