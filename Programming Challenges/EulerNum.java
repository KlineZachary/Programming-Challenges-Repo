import java.util.*;

public class EulerNum {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double n = keyboard.nextDouble();
        double output = 0;
        for (double i = n; i >= 0.0; i--) {
            output += (1 / fact(i));
        }
        System.out.println(output);
    }

    public static double fact(double n) {
        if (n == 0)
            return 1;
        else
            return (n * fact(n - 1));
    }
}