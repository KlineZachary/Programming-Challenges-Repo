import java.util.*;
import java.io.*;
public class PizzaCrust{
    public static void main(String[] args) {
        Scanner k = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        double pRad = k.nextDouble(), cRad = pRad - k.nextDouble();
        System.out.println(((Math.PI*cRad*cRad / (Math.PI*pRad*pRad)))* 100);
    }
}