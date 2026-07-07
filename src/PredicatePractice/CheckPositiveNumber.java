package PredicatePractice;

import java.util.InputMismatchException;
import java.util.function.Predicate;
import java.util.Scanner;
public class CheckPositiveNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isPositive = (num) -> num > 0;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check positive number:- " +isPositive.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
