import java.util.*;
import java.io.*;
public class ANewAlphabet{
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String input = k.nextLine().toLowerCase();
        StringBuilder output = new StringBuilder("");
        String[] alphabet = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};
        Map<Character,String>  trans = new HashMap<>();
        int start = (int) 'a'; //start of real alpahabet

        //Fill HashMap
        for(int i = 0; i < alphabet.length;i++){
            trans.put((char) start++, alphabet[i]);
        }

        //Create output
        for(int i = 0; i < input.length(); i++){
            if(trans.containsKey(input.charAt(i))){
                output.append(trans.get(input.charAt(i)));
            }else{
                output.append(input.charAt(i));
            }
        }
        //Print output
        System.out.println(output.toString());
    }
}