package Date_Time_Local;

import java.time.LocalDateTime;

public class DateTimeParts {
    public static void main(String[] args){

        LocalDateTime current = LocalDateTime.now();

        System.out.println("Years:- " +current.getYear());
        System.out.println("Months:- " +current.getMonth());
        System.out.println("Date:- " +current.getDayOfMonth());
        System.out.println("Hours:- " +current.getHour());
        System.out.println("Minutes:- " +current.getMinute());
        System.out.println("Second:- " +current.getSecond());

    }
}
