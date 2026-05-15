package TimeAPI;

import java.time.LocalTime;

public class AddMin {
    public static void main(String[] args){

        LocalTime today = LocalTime.now();

        LocalTime newTime = today.plusHours(10).plusMinutes(50);

        System.out.println("Current Time:- " +today);
        System.out.println("NewTime:- " +newTime);

    }
}
