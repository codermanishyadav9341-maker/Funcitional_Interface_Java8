package Date_Time;

import java.time.LocalTime;
public class CompareTime {
    public static void main(String[] args){

        LocalTime time = LocalTime.of(1,45);

        LocalTime newTime = LocalTime.of(2,30);

        System.out.println(time.isAfter(newTime));
        System.out.println(time.isBefore(newTime));
        System.out.println(time.compareTo(newTime));
    }
}
