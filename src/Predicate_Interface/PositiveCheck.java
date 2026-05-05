package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class PositiveCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isPositive = num -> num>=0;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("isPositive:- " +isPositive.test(num));

    }
}
