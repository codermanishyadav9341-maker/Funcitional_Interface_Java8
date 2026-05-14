package Date_Time_Zone;

import java.time.ZonedDateTime;

public class CurrentZonedDateTime {
    public static void main(String[] args){

        ZonedDateTime zdt = ZonedDateTime.now();

        System.out.println("Current:- " +zdt);

    }
}
