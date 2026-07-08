package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckDivisibleOR {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isDivisible = (num) -> (num%2 == 0 || num%5 == 0);

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check divisible by 2 || 5:- " +isDivisible.test(num));

        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
