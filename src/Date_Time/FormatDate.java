package Date_Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDate {
    public static void main(String[] args){

        LocalDate dd = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String formatted = dd.format(formatter);

        System.out.println(formatted);

    }
}
