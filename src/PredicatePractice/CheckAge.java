package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckAge {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isAge = (age) -> age >= 18;

            System.out.print("Enter Age:- ");
            int age = scan.nextInt();

            System.out.println("Check age for voting:- " +isAge.test(age));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
