import java.util.*;
public class numbertree{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int levels = keyboard.nextInt();
        int root = 1;
        String path = keyboard.hasNext() ? keyboard.next(): "";// (cond) ? (1st value if true) : (2nd value if false)
        for(int i = 0; i < path.length(); i++){
            char letter = path.charAt(i);
            if(letter == 'L') root <<= 1;
            else root = (root << 1) + 1;
        }
        System.out.println((1 << (levels+1)) - root);
 }
}
/*  
    Shorter version:

    
    Scanner scan = new Scanner(System.in);
        int h = scan.nextInt(), i =1;// height
        String path = scan.hasNext() ? scan.next() : "";// If no path, set path to ""
        for (int j = 0; j < path.length(); j++) i = (i << 1) | (path.charAt(j) == 'L' ? 0 : 1);
        System.out.println((1 << (h + 1)) - i);
        */

        //111 = 7
        //1110 + 1
        //1110 + 0

        //10110
 //OR     00001
        //10111