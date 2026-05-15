package DateTimeAPI;

import java.time.LocalDateTime;

public class AddDays {
    public static void main(String[] args){

        LocalDateTime dt = LocalDateTime.now();


        System.out.println("CurrentDateTime is:- " +dt);
        System.out.println("Add Days:- " +dt.getDayOfWeek());
        System.out.println("Add hours:- " +dt.getHour());
    }
}
