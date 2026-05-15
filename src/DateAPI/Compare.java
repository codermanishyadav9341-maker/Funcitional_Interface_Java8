package DateAPI;

import java.time.LocalDate;
public class Compare {
    public static void main(String[] args){

        LocalDate date = LocalDate.of(2026,5,15);

        LocalDate newDate = LocalDate.of(2026,3,15);

        System.out.println(date.isAfter(newDate));
        System.out.println(date.isBefore(newDate));
        System.out.println(date.compareTo(newDate));

    }
}
