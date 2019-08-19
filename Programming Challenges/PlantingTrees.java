import java.util.*;
public class PlantingTrees{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt(), partyDay = 0, k =  1,max = 0;
        int[] days = new int[cases];
        for(int i = 0; i < cases; i++) days[i] = keyboard.nextInt();
        Arrays.sort(days);
        for(int i = days.length - 1; i >= 0;i--){
            max = Math.max(days[i] + k, max);
            k++;
        }
        System.out.println(max + 1);
    }
}