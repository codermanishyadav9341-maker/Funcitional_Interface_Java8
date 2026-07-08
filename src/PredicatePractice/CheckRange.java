package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckRange {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isRange = (num) -> (num >= 1 && num >= 50);

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check outside Range[1-50]:- " +isRange.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
