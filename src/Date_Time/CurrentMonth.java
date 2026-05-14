package Date_Time;

import java.time.LocalDate;
public class CurrentMonth {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();

        System.out.println("Current Months:- " +today.getMonth());

    }
}
