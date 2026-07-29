package Predicate_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckAge {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            final Predicate<Integer> isVote = (age) -> age >= 18;

            System.out.print("Enter age:- ");
            int age = scan.nextInt();

            System.out.println("Check age for voting:- " +isVote.test(age));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid! Please enter integer number");
        }
    }
}
