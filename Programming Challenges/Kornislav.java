import java.util.*;
import java.io.*;
public class Kornislav{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] nums = {keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt()};
        Arrays.sort(nums);
        System.out.println(nums[0] * nums[2]);
    }
}