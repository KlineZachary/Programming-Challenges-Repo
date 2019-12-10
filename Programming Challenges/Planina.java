import java.util.*;
public class Planina{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int inter = keyboard.nextInt(), side = 2;
        while(inter > 0){
            side += (side - 1);
            inter--;
        }
        System.out.println((int) Math.pow(side, 2));
    }
}