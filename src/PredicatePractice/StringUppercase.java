package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class StringUppercase {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)) {

            Predicate<String> isUppercase = (str) -> str.equals(str.toUpperCase());

            System.out.print("Enter characters:- ");
            String str = scan.nextLine();


            System.out.println("Check Uppercase:- " +isUppercase.test(str));

        }
    }
}
