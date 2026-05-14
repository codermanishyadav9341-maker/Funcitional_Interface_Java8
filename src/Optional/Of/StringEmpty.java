package Optional.Of;

import java.util.Scanner;
import java.util.Optional;
public class StringEmpty {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name:- ");
        String name = scan.nextLine();

        Optional<String> result =
                Optional.of(name);

        System.out.println(result.isEmpty());



    }
}
