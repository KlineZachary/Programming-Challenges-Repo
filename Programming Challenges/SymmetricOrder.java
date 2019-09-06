import java.util.*;
public class SymmetricOrder{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numCases = 1;
        while(true){
            int num = keyboard.nextInt();
            int j = 0;
            int k = num - 1;
            String[] array = new String[num];
            if(num == 0) break;
            keyboard.nextLine();
            for(int i = 0; i < num; i++){
                if (i % 2 == 0){
                    array[j] = keyboard.nextLine();
                    j++;
                }  
                else{
                    array[k] = keyboard.nextLine();
                    k--;
                }  
            }
            System.out.println("SET " + numCases);
            for(int i = 0; i < array.length;i++) System.out.println(array[i]);
            numCases++;

        }
    }
}