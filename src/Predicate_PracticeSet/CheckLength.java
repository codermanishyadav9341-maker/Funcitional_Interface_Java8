package Predicate_PracticeSet;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckLength {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            final Predicate<String> isLength = (str) -> str.length() > 5;

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Check String greaterThan > 5:- " +isLength.test(str));
        }
    }
}
