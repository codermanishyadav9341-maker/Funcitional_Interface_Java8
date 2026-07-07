package PredicatePractice;

import java.util.InputMismatchException;
import java.util.function.Predicate;
import java.util.Scanner;
public class CheckOddNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isOdd = (num) -> num%2 != 0;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check odd number:- " +isOdd.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
