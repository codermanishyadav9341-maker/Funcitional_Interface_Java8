package Optional.Of;

import java.util.Scanner;
import java.util.Optional;
public class Practice2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name:- ");
        String name = scan.nextLine();

        Optional<String> result =
                Optional.of(name)
                        .filter(str -> str.length() > 10);

        result.ifPresent(System.out::println);
        scan.close();
    }
}
