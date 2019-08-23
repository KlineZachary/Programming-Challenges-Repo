import java.util.*;
import java.io.*;
public class ClosestSums {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int testCase = 1;
        while (keyboard.hasNextInt()) {

            int totalNums = keyboard.nextInt();
            int[] numsOne = new int[totalNums];
            for (int i = 0; i < totalNums; i++)
                numsOne[i] = keyboard.nextInt();

            int totalNumsTwo = keyboard.nextInt();
            System.out.println("Case " + testCase++ + ":");

            for (int i = 0; i < totalNumsTwo; i++) {
                int sum = keyboard.nextInt();
                System.out.println("Closest sum to " + sum + " is " + closestSum(numsOne, sum) + ".");
            }
        }

    }

    public static int closestSum(int[] arrayOne, int sum) {
        int closestSum = Integer.MAX_VALUE;
        int output = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = (i + 1); j < arrayOne.length; j++) {
                int twoSum = arrayOne[i] + arrayOne[j];
                int abs = Math.abs(twoSum - sum);
                if (abs < closestSum) {
                    closestSum = abs;
                    output = twoSum;
                }

            }

        }
        return output;

    }
}