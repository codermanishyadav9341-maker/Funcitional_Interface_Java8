package Date_Time;

import java.time.LocalDate;
public class AddDays {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();

        LocalDate nextWeek = today.plusDays(7);

        System.out.println("After Days:- " +nextWeek);

    }
}
