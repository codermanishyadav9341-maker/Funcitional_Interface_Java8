package Predicate_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckSalary {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            final Predicate<Integer> isSalary = (num) -> num >= 50000;

            System.out.print("Enter Salary:- ");
            int num = scan.nextInt();

            System.out.println("Check Salary greater than > 50000:- " +isSalary.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid! Please enter integer number");
        }
    }
}
