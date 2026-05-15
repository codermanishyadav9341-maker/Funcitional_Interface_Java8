package TimeAPI;

import java.time.LocalTime;
public class CompareTime {
    public static void main(String[] args){

        LocalTime time = LocalTime.of(7,30,50);

        LocalTime newTime = LocalTime.of(3,30,50);

        System.out.println(time.compareTo(newTime));

    }
}
