import java.util.*;
import java.io.*;
public class Putovanje {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nC = br.readLine().split(" ");
        String[] foodWeights = br.readLine().split(" ");
        int maxBelly = Integer.parseInt(nC[1]), mostFruit = 0;
        for(int i = 0; i < foodWeights.length;i++){
            int sum = 0;
            int foodsEat = 0;
            for(int j = i; j < foodWeights.length;j++){
                int fruit = Integer.parseInt(foodWeights[j]);
                if(sum + fruit <= maxBelly) {
                    sum += fruit;
                    foodsEat++;
                }
            }
            mostFruit = Math.max(mostFruit,foodsEat);
        }
        System.out.println(mostFruit);
    }
}