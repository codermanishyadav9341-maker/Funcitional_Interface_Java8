package Predicate_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckGreater {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            final Predicate<Integer> isGreater = (num)  -> num >= 100;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check Greater than >= 100:- " +isGreater.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid! please enter integer number");
        }
    }
}
