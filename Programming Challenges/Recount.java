import java.util.*;
import java.io.*;
public class Recount{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Map<String, Integer> names = new HashMap<>();
        int maxNum = 0, numOfMaxes = 0;
        String winner = "";
        while(true){
            String name = keyboard.nextLine();

            //Stop looping at end
            if(name.equals("***")) break;

            //If name is in hashmap increment number and add back new values
            if(names.containsKey(name)){
                int numName = names.get(name);
                numName++;
                names.remove(name);
                names.put(name, numName);
            //If name is not in has map add it
            }else names.put(name, 1);   
        }
        //Find highest value
        for (String name: names.keySet()){
            int value = names.get(name);
            if(value > maxNum) maxNum = value;  
        }
        
        //Find how many maxes there
        for (String name: names.keySet()){
            if(names.get(name) == maxNum) {
                numOfMaxes++;
                winner = name;
            }
        }
        //If only one winner print their name else Runoff!
        System.out.println(numOfMaxes == 1 ? winner : "Runoff!");    
    }
}