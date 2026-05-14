package Date_Time;

import java.time.LocalTime;

public class AddSecond {
    public static void main(String[] args){

        LocalTime time = LocalTime.now();

        LocalTime newTime = time.plusSeconds(45);

        System.out.println(time);
        System.out.println("Add Second:- " +newTime);

    }
}
