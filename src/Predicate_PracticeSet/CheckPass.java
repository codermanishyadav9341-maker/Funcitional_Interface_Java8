package Predicate_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckPass {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isPassed = (marks) -> marks >= 40;

            System.out.print("Enter Marks:- ");
            int marks = scan.nextInt();

            System.out.println("Check Result:- " +isPassed.test(marks));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid! Please enter integer number");
        }
    }
}
