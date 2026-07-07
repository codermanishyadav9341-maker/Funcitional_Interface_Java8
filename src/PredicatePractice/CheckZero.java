package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckZero {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isZero = num -> num == 0;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check zero:- " +isZero.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
