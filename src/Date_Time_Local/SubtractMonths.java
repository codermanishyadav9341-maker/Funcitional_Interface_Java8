package Date_Time_Local;

import java.time.LocalDateTime;

public class SubtractMonths {
    public static void main(String[] args){

        LocalDateTime dt = LocalDateTime.now();

        LocalDateTime dt2 = dt.minusMonths(1);

        System.out.println("Current:- " +dt);
        System.out.println("Before 1 months ago:- " +dt2);

    }
}
