package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class StringLast {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isLast = str -> str != null
                                                    && !str.isBlank()
                                                    && str.endsWith("Boot");

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            System.out.println("Contain Boot:- " +isLast.test(str));

        }
    }
}
