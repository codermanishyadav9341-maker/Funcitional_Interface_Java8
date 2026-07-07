package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckMark {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isMark = (mark) ->  mark >= 35;

            System.out.print("Enter marks:- ");
            int mark = scan.nextInt();

            System.out.println("Check marks >= 35:- " +isMark.test(mark));

        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
