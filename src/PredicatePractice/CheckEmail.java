package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckEmail {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isEmail = (str) -> str != null && str.contains("@");

            System.out.print("Enter characters:- ");
            String str = scan.nextLine();

            System.out.println("Check email:- " +isEmail.test(str));
        }
    }
}
