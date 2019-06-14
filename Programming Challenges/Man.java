import java.util.*;
import java.io.*;
public class Man{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCases = keyboard.nextInt();
        int[] number = new int[testCases];
        ArrayList<Integer> output = new ArrayList<Integer>();
        int i = 0;
        
        while(i < testCases){
            int numberCities = keyboard.nextInt();
            ArrayList<String> array = new ArrayList<String>();
            for(int j = 0; j < numberCities; j++){
                array.add(keyboard.next());
            }
            // System.out.println(compare(array));
            output.add(compare(array));
            i++;
        }

        //Print out because sysout was not working
        for(int k = 0; k < output.size();k++){
            System.out.println(output.get(k));
        }
    }
    //Returns new length after getting rid of duplicats
    public static int compare(ArrayList<String> array){
        for(int i = 0; i < array.size(); i++){
            for(int j = i + 1; j < array.size(); j++){
                if(array.get(i).equals(array.get(j))){array.remove(j);} 
            }
        }

        for(int i = 0; i < array.size(); i++){
            for(int j = i + 1; j < array.size(); j++){
                if(array.get(i).equals(array.get(j))){array.remove(j);} 
            }
        }

        for(int i = 0; i < array.size(); i++){
            for(int j = i + 1; j < array.size(); j++){
                if(array.get(i).equals(array.get(j))){array.remove(j);} 
            }
        }
        return array.size();
    }
}