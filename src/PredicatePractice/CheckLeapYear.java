package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckLeapYear {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isYear = (year) -> {
                if((year%400 == 0) || (year%100 != 0) && (year%4 == 0)){
                    return true;
                }
                return false;
            };

            System.out.print("Enter Year:- ");
            int year = scan.nextInt();

            System.out.println("LeapYear check:- " +isYear.test(year));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
