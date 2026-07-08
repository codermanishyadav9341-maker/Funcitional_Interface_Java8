package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckLowercase {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isLowercase = (str) -> str != null && !str.isBlank() && str.toLowerCase().startsWith("manish");

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            System.out.println("Check lowercase:- " +isLowercase.test(str));
        }
    }
}
