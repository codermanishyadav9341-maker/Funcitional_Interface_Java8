package Predicate_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckOdd {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            final Predicate<Integer> isOdd = (num) -> num%2 != 0;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check Odd number:- " +isOdd.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid! Please enter integer number");
        }
    }
}
