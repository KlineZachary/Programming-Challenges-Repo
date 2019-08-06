import java.util.*;
public class CostumeContest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();
        int minNum = Integer.MAX_VALUE;
        TreeMap<String, Integer> map = new TreeMap<>(); //Tree map puts keys in order HashMap DOES NOT
        
        //Fill hash map
        for(int i = 0; i < cases;i++){
            String costume = keyboard.next();
            if(map.containsKey(costume)){
                int num = map.get(costume);
                num++;
                map.remove(costume);
                map.put(costume, num);
            }else map.put(costume, 1);
        }
        
        //Find min value
        for (String key : map.keySet()) 
            if(map.get(key) < minNum) minNum = map.get(key);

        //Print values with min value
        for (String key : map.keySet()) 
            if(map.get(key) == minNum) System.out.println(key);;
         
    }
}