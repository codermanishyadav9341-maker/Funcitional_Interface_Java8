package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckDivisible {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isDivisible = (num) -> num%5 == 0;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check divisible by 5:- " +isDivisible.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
