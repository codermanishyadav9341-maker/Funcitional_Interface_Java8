package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckEndDigit {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isLastDigit = str -> str != null
                                                          && !str.isBlank()
                                                          && str.matches(".*\\d$");

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            System.out.println("Check string end with digits:- " +isLastDigit.test(str));

        }
    }
}
