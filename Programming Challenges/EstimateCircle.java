import java.util.*;
import java.io.*;
public class EstimateCircle{
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String line = keyboard.readLine();
            String[] nums = line.split(" ");
            double radius = Double.parseDouble(nums[0]), totalDots = Double.parseDouble(nums[1]), dotsCircle = Double.parseDouble(nums[2]);
            if((radius == 0.0) && (totalDots == 0.0) && (dotsCircle == 0.0)) return;
            System.out.print(Math.PI * (Math.pow(radius, 2.0)) + " ");
            System.out.print(((dotsCircle / totalDots) * Math.pow(radius*2, 2)) + "\n");
        }

    }
}