package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class StringLowercase {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isLowercase = (str) -> str != null && str.equals(str.toLowerCase());

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Check lowercase:- " +isLowercase.test(str));
        }
    }
}
