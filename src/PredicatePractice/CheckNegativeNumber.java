package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckNegativeNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isNegative = num -> num < 0;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check negative number:- " +isNegative.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
