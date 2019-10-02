import java.util.*;
import java.io.*;
public class BusySchedule{
    public static void main(String[] args) throws IOException{
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int numAppointments = Integer.parseInt(keyboard.readLine());
            if (numAppointments == 0) break;
            ArrayList<Integer> amMin = new ArrayList<>();
            ArrayList<Integer> pmMin = new ArrayList<>();
            Hashtable<Integer, String> amMap = new Hashtable<>();
            Hashtable<Integer, String> pmMap = new Hashtable<>();

            for(int i = 0; i < numAppointments;i++){
                String time = keyboard.readLine();
                int indexOfColon = time.indexOf(":");
                int hour = Integer.parseInt(time.substring(0, indexOfColon));
                if(hour == 12) hour = 0;
                int min = (time.substring(indexOfColon + 1,indexOfColon + 2).equals("0")) ? (Integer.parseInt(time.substring(indexOfColon + 2, indexOfColon + 3))) :(Integer.parseInt(time.substring(indexOfColon + 1, indexOfColon + 3)));
                char amPm = time.charAt(indexOfColon + 4);
                int totalMin = (hour * 60) + min;
                if(amPm == 'p') {
                    pmMin.add(totalMin);
                    pmMap.put(totalMin, time);
                }
                else {
                    amMin.add(totalMin);
                    amMap.put(totalMin, time);
                }
            }
            Collections.sort(amMin);
            Collections.sort(pmMin);
            for(int num : amMin) System.out.println(amMap.get(num));
            for(int num : pmMin) System.out.println(pmMap.get(num));
            System.out.println();
        }

    }
}