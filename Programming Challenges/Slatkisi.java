import java.util.*;
import java.io.*;

public class Slatkisi {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = keyboard.readLine().split(" ");
        int candyPrice = Integer.parseInt(nums[0]), numberZeros = Integer.parseInt(nums[1]);
        int num = (int) Math.pow(10, numberZeros);
        int upperBound = 0, lowerBound = 0, output = 0, lowerSub = 0, upperSub = 0;
        for(int i = candyPrice; i < Integer.MAX_VALUE;i++){
            if(i % num == 0) {
                upperBound = i;
                break;
            }
        }
        lowerBound = upperBound - num;
        lowerSub = Math.abs(candyPrice - lowerBound);
        upperSub = Math.abs(upperBound - candyPrice);
        if(lowerSub < upperSub) System.out.println(lowerBound);
        else System.out.println(upperBound);
    }
}