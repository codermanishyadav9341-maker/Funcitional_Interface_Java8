package Predicate_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckPositive {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

          final  Predicate<Integer> isPositive  = (num) -> num >= 0;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check Positive number:- " +isPositive.test(num));

        }
        catch(InputMismatchException e){
            System.out.println("Please enter Integer number");
        }
    }
}
