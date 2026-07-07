package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class ChekEmpty {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isEmpty = (str) -> str.isEmpty();

            System.out.print("Enter characters:- ");
            String str = scan.nextLine();

            System.out.println("Check empty:- " +isEmpty.test(str));
        }
        catch(IllegalArgumentException e){
            System.out.println("Sometime went wrong");
        }
    }
}
