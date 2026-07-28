package Predicate_PracticeSet;

import java.util.Scanner;
import java.util.function.Predicate;
public class checkEmpty {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            final Predicate<String> isEmpty = (str) -> str.trim().isEmpty();

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Check empty:- " +isEmpty.test(str));
        }
    }
}
