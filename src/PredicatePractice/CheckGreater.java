package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckGreater {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isGreater = (num) -> num >= 100;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check greaterThan >= 100:- " +isGreater.test(num));

        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
