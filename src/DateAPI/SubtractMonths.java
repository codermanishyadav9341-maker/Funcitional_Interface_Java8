package DateAPI;

import java.time.LocalDate;

public class SubtractMonths {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();

        LocalDate beforeDate = today.minusMonths(2);

        System.out.println("Current Date:- " +today);
        System.out.println("Two Months Before:- " +beforeDate);

    }
}
