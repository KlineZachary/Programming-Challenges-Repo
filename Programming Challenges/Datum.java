import java.util.*;
import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Datum{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int day = keyboard.nextInt(), month = keyboard.nextInt();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate date = LocalDate.parse(day + "/" + month + "/" + "2009", format);
        DayOfWeek dayWord = date.getDayOfWeek();
        String output = dayWord.toString().substring(0,1) + dayWord.toString().substring(1).toLowerCase();
        System.out.println(output);  
    }
}