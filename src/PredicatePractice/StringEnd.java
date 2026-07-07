package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class StringEnd {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isEnd = (str) -> str != null && str.toLowerCase().endsWith("v");

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Character endWith 'v':- " +isEnd.test(str));
        }
    }
}
