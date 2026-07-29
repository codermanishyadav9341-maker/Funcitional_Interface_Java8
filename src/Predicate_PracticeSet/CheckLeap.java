package Predicate_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckLeap {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isLeapYear = (year) -> year%400 == 0 || year%100 != 0 && year%4 == 0;

            System.out.print("Enter Year:- ");
            int year = scan.nextInt();

            System.out.println("Check Leap Year:- " +isLeapYear.test(year));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid! Please enter Integer number");
        }
    }
}
