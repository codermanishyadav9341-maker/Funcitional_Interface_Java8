package Date_Time;

import java.time.LocalDate;

public class TomorrowDate {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();

        LocalDate tomorrow = today.plusDays(1);

        System.out.println("Today:- " +today);
        System.out.println("Tomorrow Date:- " +tomorrow);
    }
}
