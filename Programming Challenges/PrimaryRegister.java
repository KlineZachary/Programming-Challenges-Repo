import java.util.*;
public class PrimaryRegister{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] primarys = {2,3,5,7,11,13,17,19};
        int[] input = new int[primarys.length];
        int steps = 0;
        for(int i = 0; i < input.length;i++) input[i] = keyboard.nextInt();
        while (inc(primarys, input, 0)) steps++;
        System.out.println(steps);
    }
    public static boolean inc(int[] primarys,int[] input, int index){
        if(index == primarys.length) return false;
        if (++input[index] >= primarys[index]) {
            input[index] = 0;
            return inc(primarys, input, index + 1);
        }
        return true;
    }
}