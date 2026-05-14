package Optional.Of;

import java.util.Scanner;
import java.util.Optional;
public class Test1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name:- ");
        String name = scan.nextLine();

        Optional<String> result = Optional.of(name);

        result.ifPresent(System.out::println);
    }
}
