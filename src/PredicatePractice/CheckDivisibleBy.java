package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckDivisibleBy {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isNotDivisible3 = (num) -> num%3 != 0;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Not divisible by 3:- " + isNotDivisible3.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
