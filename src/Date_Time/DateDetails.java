package Date_Time;

import java.time.LocalDate;

public class DateDetails {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();

        System.out.println("Years:- " +today.getYear());
        System.out.println("Months:- " +today.getMonth());
        System.out.println("Days:- " +today.getDayOfMonth());

    }
}
