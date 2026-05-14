package Date_Time;

import java.time.LocalTime;

public class AddHours {
    public static void main(String[] args){

        LocalTime time = LocalTime.now();

        LocalTime add = time.plusHours(1);

        System.out.println("Current Time:- " +time);
        System.out.println("New Time After 1 hr:- " +add);

    }
}
