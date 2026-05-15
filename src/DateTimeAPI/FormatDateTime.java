package DateTimeAPI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class FormatDateTime {
    public static void main(String[] args){

        LocalDateTime dt = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-mm-ss HH:mm:ss");

        System.out.println(formatter);

    }
}
