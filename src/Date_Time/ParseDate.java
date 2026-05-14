package Date_Time;

import java.time.LocalDate;

public class ParseDate {
    public static void main(String[] args){

        LocalDate dd = LocalDate.parse("2026-05-14");

        System.out.println(dd);
    }
}
