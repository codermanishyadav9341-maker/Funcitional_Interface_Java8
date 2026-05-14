package Optional.Of;

import java.util.Scanner;
import java.util.Optional;
public class UpperCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name:- ");
        String name = scan.nextLine();

        Optional<String> result =
                Optional.of(name)
                        .map(str-> str.toUpperCase());

        System.out.println("Name:- " +result.orElse("No name"));

        scan.close();
    }
}
