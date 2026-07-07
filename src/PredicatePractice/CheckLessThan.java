package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckLessThan {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isLess = (num) -> num < 50;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check lessThan < 50:- " +isLess.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
