package Date_Time;

import java.time.LocalDate;

public class SubtractMonths {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();

        LocalDate previousMonth = today.minusMonths(2);

        System.out.println(previousMonth);
    }
}
