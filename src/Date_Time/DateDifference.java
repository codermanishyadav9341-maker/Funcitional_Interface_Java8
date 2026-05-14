package Date_Time;

import java.time.LocalDate;
import java.time.Period;

public class DateDifference {
    public static void main(String[] args){

        LocalDate dd = LocalDate.of(2003,7,15);

        LocalDate today = LocalDate.now();

        Period period = Period.between(dd,today);
        System.out.println("Years:- " +period.getYears());
        System.out.println("Months:- " +period.getMonths());
        System.out.println("Date:- " +period.getDays());

    }
}
