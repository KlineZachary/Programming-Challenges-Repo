import java.util.*;
public class DiceCup{
    public static void main(String[] args) {
        //Vars
        Scanner keyboard = new Scanner(System.in);
        int diceOne = keyboard.nextInt(), diceTwo = keyboard.nextInt(), max = 0;
        Hashtable<Integer,Integer> map = new Hashtable<>(); // Hashmap = Sum : # of times we have seen that sum
        ArrayList<Integer> output = new ArrayList<>();

        //number from di one
        for(int i = 1; i <= diceOne;i++){
            //number from di two
            for(int j = 1; j <= diceTwo;j++){
                int sum = i + j;
                //If sum is already in map then increment value
                if (map.containsKey(sum)){
                    int value = map.get(sum);
                    map.remove(sum);
                    ++value;
                    map.put(sum, value);
                //If not in map then add to map
                }else map.put(sum, 1);
            }
        }

        //Find max 
        for(int key: map.keySet()){
            max = Math.max(max, map.get(key));
        }

        //Get sums
        for(int key: map.keySet()){
            if(map.get(key) == max) output.add(key);
        }  

        //Sort array list
        Collections.sort(output);

        //Print out each element in array list
        for(int num : output) System.out.println(num);
    }
}