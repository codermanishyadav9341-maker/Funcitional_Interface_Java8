package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckBetween {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer>  isBet = (num) -> (num > 10 && num < 20);

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check between num > 10 && num < 20:- " +isBet.test(num));
        }
         catch(InputMismatchException e){
            System.out.println("Invalid input");
         }
    }
}
