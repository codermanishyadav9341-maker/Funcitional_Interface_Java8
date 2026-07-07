package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckVowel {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isVowel = (str) -> str != null && str.matches("[AEIOUaeiou]");

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            System.out.println("Check vowel:- " +isVowel.test(str));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
