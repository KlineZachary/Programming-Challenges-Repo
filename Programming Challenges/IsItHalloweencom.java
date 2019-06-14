import java.util.*;
import java.io.*;
public class IsItHalloweencom{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String input = keyboard.nextLine();
        input = input.toLowerCase();
        String[] splited = input.split("\\s+");
        String word = "";
        word = (isItHalloween(splited)) ? "yup" : "nope";
        System.out.println(word); 
    }

    public static boolean isItHalloween(String[] array){
        if(array[0].equals("oct")){
           if (array[1].equals("31")){return true;}

        }else if (array[0].equals("dec")){
            if (array[1].equals("25")){return true;}
        }else{
            return false;
        } 
        
        return false;
    }
}