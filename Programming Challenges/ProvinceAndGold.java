import java.io.*;
import java.util.HashMap;

public class ProvinceAndGold {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = keyboard.readLine().split(" ");
        int gold = Integer.parseInt(nums[0]), silver = Integer.parseInt(nums[1]), copper = Integer.parseInt(nums[2]);
        int buyingPower = (gold * 3) + (silver * 2) + (copper * 1);
            if (buyingPower >= 8) System.out.println("Province or Gold");
            else if (buyingPower >= 6) System.out.println("Duchy or Gold");
            else if (buyingPower >= 5) System.out.println("Duchy or Silver");
            else if (buyingPower >= 3)System.out.println("Estate or Silver");    
            else if (buyingPower >= 2) System.out.println("Estate or Copper");    
            else System.out.println("Copper");    
    }
}