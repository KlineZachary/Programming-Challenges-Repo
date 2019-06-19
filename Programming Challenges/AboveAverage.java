import java.util.*;
import java.io.*;
public class AboveAverage{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int cases = keyboard.nextInt();
        for(int i = 0; i < cases;i++){
            int numKids = keyboard.nextInt();
            int[] grades = new int[numKids];
            double average = getAverage(numKids,keyboard,grades);
            double aboveAvg = 0.0;
            for(int j = 0; j < grades.length;j++){
                if(grades[j] > average) {aboveAvg+=1.0;}
            }
            System.out.printf("%.3f", (aboveAvg / numKids) * 100);
            System.out.println("%");
        }
    }

    public static double getAverage(int numKids, Scanner keyboard,int[] grades){
        double average = 0.0;
        for(int j = 0; j < numKids; j++){
            int grade = keyboard.nextInt();
            grades[j] = grade;
            average+= grade;  
        }
        return (average / numKids);
    }
}