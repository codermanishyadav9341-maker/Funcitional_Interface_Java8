package Predicate_Roof;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Even number check
        Predicate<Integer> isEven = num -> num%2 == 0;

        // Odd number check
        Predicate<Integer> isOdd = num -> num%2 != 0;

          // Positive number check
        Predicate<Integer> isPositive = num -> num >= 0;

        // Negative number check
        Predicate<Integer> isNegative = num -> num < 0;

        // Zero number check
        Predicate<Integer> isZero = num -> num == 0;

        // Greater than 0
        Predicate<Integer> isGreater = num -> num >= 0;

        // Divisible by 5
        Predicate<Integer> isDivisible = num -> num%5 == 0;

        // Divisible by 3
        Predicate<Integer> isDivided = num -> num%3 == 0;

        // Less than
        Predicate<Integer> isLess = num -> num < 50;


        // Between 10-100
        Predicate<Integer> isBetween = num -> (num >= 10 && num < 100);


        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("----------------=:Result:=------------------");
        System.out.println("Is even number check:- " +isEven.test(num));
        System.out.println("Is Odd number check:- " +isOdd.test(num));
        System.out.println("Is Positive number check:- " +isPositive.test(num));
        System.out.println("Is Negative number check:- " +isNegative.test(num));
        System.out.println("IS Zero number check:- " +isZero.test(num));
        System.out.println("Is Greater than check:- " +isGreater.test(num));
        System.out.println("Is Less Than check:- " +isLess.test(num));
        System.out.println("Is Divisible by 5 check:- " +isDivisible.test(num));
        System.out.println("Is Divisible by 3 check:- " +isDivided.test(num));
        System.out.println("Is Between 10 && 100 is:- " +isBetween.test(num));




    }
}
