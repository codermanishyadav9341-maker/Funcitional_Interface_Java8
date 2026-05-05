package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class EmployeeID {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isID = digit -> digit != null && digit > 0;

        System.out.print("Enter Your ID:- ");
        int digit = scan.nextInt();

        System.out.println("Employee ID > 0 is:- " +isID.test(digit));

    }
}
