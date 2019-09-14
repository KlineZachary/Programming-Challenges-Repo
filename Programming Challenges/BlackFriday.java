import java.util.*;
public class BlackFriday {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cases = keyboard.nextInt();
        keyboard.nextLine();
        int[] counting = new int[100];
        int[] nums = new int[cases];
        int unique = 0;
        for (int i = 0; i < cases; i++) {
            int num = keyboard.nextInt();
            nums[i] = num;
            counting[num]++;
        }
        for (int i = counting.length - 1; i >= 0; i--) {
            if (counting[i] == 1) {
                unique = i;
                break;
            }
        }
        for (int i = 0; i < cases; i++) {
            if(nums[i] == unique) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println("none");
    }
}