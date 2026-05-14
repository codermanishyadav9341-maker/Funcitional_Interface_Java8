package Date_Time;

import java.time.LocalDate;
public class CompareDate {
    public static void main(String[] args){

        LocalDate d1 = LocalDate.of(2026,5,14);

        LocalDate d2 = LocalDate.of(2025,5,14);

        System.out.println(d1.compareTo(d2));

    }
}
