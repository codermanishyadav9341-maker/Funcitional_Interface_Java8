package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class Multiply {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isMultiplyOf10 = (num) -> num%10 == 0;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check multiply of 10:- " + isMultiplyOf10.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
