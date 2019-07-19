import java.util.*;
import java.io.*;
public class JudgingMoose{
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int left = k.nextInt(), right = k.nextInt();
        if(left == 0 && right == 0) System.out.println("Not a moose");
        else if(left!=right) {
            if(left>right) System.out.println("Odd " + (left*2));
            else System.out.println("Odd " + (right*2));     
        }
        else if(left == right) System.out.println("Even " + (left+right));
    }
}