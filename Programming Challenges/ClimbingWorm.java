import java.util.*;
import java.io.*;
public class ClimbingWorm{
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = keyboard.readLine().split(" ");
        int canClimb = Integer.parseInt(nums[0]), canFall = Integer.parseInt(nums[1]), poleHeight = Integer.parseInt(nums[2]);
        int ans = Math.max(0, (int) Math.ceil(poleHeight / (double) (canClimb - canFall)) - 5);
        int startHeight =  ans * (canClimb - canFall);
        while(true){
            startHeight += canClimb;
            ans++;
            if(startHeight >= poleHeight) break;
            startHeight -= canFall;
        }
        System.out.println(ans);
    }
}