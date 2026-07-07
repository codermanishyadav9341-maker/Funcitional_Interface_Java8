package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class Greater {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isGreater = (num) -> num >= 50000;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("GreaterThan >= 50000:- " +isGreater.test(num));

        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
