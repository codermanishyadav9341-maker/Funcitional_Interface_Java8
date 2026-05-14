package Optional.ofNullable;

import java.util.Scanner;
import java.util.Optional;
public class StringName {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Name:- ");
        String name = scan.nextLine();

        Optional.ofNullable(name)
                        .ifPresentOrElse(
                                  str -> System.out.println("Name:- " + str),
                                () ->System.out.println("Name is missing")
                        );

        scan.close();
    }
}
