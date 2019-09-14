import java.util.*;
import java.io.*;
public class SecureDoors{
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.parseInt(keyboard.readLine());
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i < cases; i++){
            String line = keyboard.readLine();
            String[] words = line.split(" ");
            String action = words[0], name = words[1];
            if (action.equals("entry")){
                //user has already entered once
                if(names.contains(name)) System.out.println(name + " entered (ANOMALY)");
                //user has not entered yet
                else{
                    System.out.println(name + " entered");
                    names.add(name);
                }
            }else{
                //user has entered and should exit
                if(names.contains(name)){
                    System.out.println(name + " exited");
                    names.remove(name);
                //user has not entered before so they cant exit
                }else System.out.println(name + " exited (ANOMALY)");

            }
        }

        
    }
}