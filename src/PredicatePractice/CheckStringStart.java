package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckStringStart {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isCheck = (str) -> str != null && str.toUpperCase().startsWith("M") && str.toLowerCase().endsWith("v");

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Check string:- " +isCheck.test(str));
        }
    }
}
