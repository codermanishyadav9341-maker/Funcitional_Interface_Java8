package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class DivisibleBy {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isDivisible = (num) -> (num%3 == 0 && num%7 == 0);

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check divisible by 3 && 7:- " +isDivisible.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
