package Date_Time;

import java.time.LocalTime;

public class TimeParts {
    public static void main(String[] args){

        LocalTime time = LocalTime.now();

        System.out.println("Hours:- " +time.getHour());
        System.out.println("Minutes:- " +time.getMinute());
        System.out.println("Second:- " +time.getSecond());

    }
}
