package Optional.Of;

import java.util.Scanner;
import java.util.Optional;
public class StartString {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter name:- ");
        String name = scan.nextLine();

        Optional<String> result =
                Optional.of(name)
                        .filter(str-> str.startsWith("M"));
        result.ifPresent(System.out::println);

        scan.close();
    }
}
