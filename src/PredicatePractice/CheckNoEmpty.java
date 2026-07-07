package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckNoEmpty {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isNoEmpty = (str) -> !str.isEmpty();

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Check String no empty:- " +isNoEmpty.test(str));
        }
    }
}
