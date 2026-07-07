package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class checkAlpha {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isAlpha = (str) -> str != null && str.matches("[A - Za - z]+");

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Chek alphabet:- " +isAlpha.test(str));
        }
    }
}
