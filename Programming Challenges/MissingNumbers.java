import java.util.*;
import java.io.*;
public class MissingNumbers{
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int numCases = Integer.parseInt(keyboard.readLine());
        boolean allNums = true;
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i = 0; i < numCases;i++) nums.add(Integer.parseInt(keyboard.readLine()));
        Collections.sort(nums);
        for(int i = 1; i < nums.get(nums.size() - 1) + 1;i++){
            if(!(nums.contains(i))) {
                System.out.println(i);
                allNums = false;
            }
        }
        if (allNums) System.out.println("good job");
    }

}