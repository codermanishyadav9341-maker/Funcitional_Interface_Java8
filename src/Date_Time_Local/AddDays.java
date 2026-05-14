package Date_Time_Local;

import java.time.LocalDateTime;
public class AddDays {
    public static void main(String[] args){

        LocalDateTime dt = LocalDateTime.now();

        LocalDateTime dt2 = dt.plusDays(1).plusMinutes(45);


        System.out.println("Current:- " +dt);
        System.out.println("Tomorrow:- " +dt2);

    }
}
