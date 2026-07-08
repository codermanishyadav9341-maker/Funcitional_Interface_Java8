package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class StringLengthBet {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isLengthBetween5and10 = (str) -> str != null
                                                                     && !str.isBlank()
                                                                     && str.length() >= 5
                                                                     && str.length() < 10;

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Check length between 5 && 10 is:- " +isLengthBetween5and10.test(str));
        }
    }
}
