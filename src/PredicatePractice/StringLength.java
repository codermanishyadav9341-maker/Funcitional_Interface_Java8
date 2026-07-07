package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class StringLength {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isLength = (str) -> str.length() > 6;

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            System.out.println("Character length:- " +isLength.test(str));
        }
    }
}
