package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckDigit {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String>  isDigit = (str) -> str != null && str.matches("[\\d]");

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            System.out.println("Check digits:- " +isDigit.test(str));
        }
    }
}
