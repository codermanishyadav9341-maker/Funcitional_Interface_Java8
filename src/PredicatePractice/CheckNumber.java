package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isNumber = (str) -> str != null && str.length() == 10;

            System.out.print("Enter number:- ");
            String str = scan.nextLine();

            System.out.println("Check number:- " +isNumber.test(str));
        }
    }
}
