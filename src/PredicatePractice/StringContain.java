package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class StringContain {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isContain = (str) -> str != null && str.contains("Manish");

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            System.out.println("Character contain:- " +isContain.test(str));
        }
    }
}
