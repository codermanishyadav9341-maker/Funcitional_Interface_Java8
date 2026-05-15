package DateAPI;

import java.time.LocalDate;

public class AddDays {
    public static void main(String[] args){

        LocalDate today = LocalDate.now();

        LocalDate afterDays = today.plusDays(10);

        System.out.println("Current Date:- " +today);
        System.out.println("After 10 Days:- " +afterDays);


    }
}
