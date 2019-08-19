import java.util.*;
public class CookieSelection{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        PriorityQueue<Integer> max = new PriorityQueue<Integer>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<Integer>();
        while(keyboard.hasNextLine()){
            String input = keyboard.nextLine();
            if (input.equals("#"))System.out.println(min.poll());
            else{
                int num = Integer.parseInt(input);
                if(min.isEmpty() || (min.peek() <= num)) min.add(num);
                else max.add(num);

            }
            if(min.size() < max.size()) min.add(max.poll());
            else if (max.size() < (min.size() - 1)) max.add(min.poll());
        }        
    }
}