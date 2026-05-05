package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class NegativeCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isNegative = num -> num<0;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Is Negative:- " +isNegative.test(num));

        scan.close();

    }
}
