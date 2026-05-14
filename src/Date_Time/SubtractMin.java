package Date_Time;

import java.time.LocalTime;
public class SubtractMin {
    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        LocalTime newTime = time.minusMinutes(30);

        System.out.println("Current Time:- " +time);
        System.out.println("Minus 45 min:- " +newTime);

    }
}
