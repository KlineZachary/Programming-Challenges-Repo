import java.util.Scanner;
public class Backspace{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        StringBuilder output = new StringBuilder();
        for(int i = 0; i < input.length();i++){
            char letter = input.charAt(i);
            if(letter == '<'){
                output.deleteCharAt((output.length()) - 1);
            }else{
                output.append(letter);
            }
        }
        System.out.println(output.toString());
    }
}