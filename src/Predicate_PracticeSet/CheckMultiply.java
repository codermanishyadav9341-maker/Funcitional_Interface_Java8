package Predicate_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckMultiply {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isMulti = (num) -> num%3 == 0 && num%5 == 0;

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Check number multiply 3 && 5:- " +isMulti.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid! Please enter integer number");
        }
    }
}
