package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class NumberCheck {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isCheck = (num) -> num >= 0 && num < 100;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Number greaterThan >= 0 && lessThan < 100:- " +isCheck.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
