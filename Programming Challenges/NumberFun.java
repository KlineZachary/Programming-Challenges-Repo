import java.util.*;
import java.io.*;
public class NumberFun{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int cases = keyboard.nextInt();
        int i = 0;
        boolean resultBool;
        while(i < cases){
            int numOne = keyboard.nextInt(), numTwo = keyboard.nextInt(),result = keyboard.nextInt();
            resultBool = canMath(numOne,numTwo,result);
            if (resultBool) {System.out.println("Possible");}
            else{System.out.println("Impossible");}
            i++;
        }
    }
    public static boolean canMath(int numOne, int numTwo, int result){
        if(numOne + numTwo == result) {return true;}
        else if(numOne - numTwo == result) {return true;}
        else if(numTwo - numOne == result) {return true;}
        else if(numOne * numTwo == result) {return true;}
        else if((double)((double)(numOne) / (double)(numTwo)) == (double)(result)) {return true;}
        else if( (double)((double)(numTwo) / (double)(numOne)) == (double)(result)) {return true;}
        return false;
    }
}