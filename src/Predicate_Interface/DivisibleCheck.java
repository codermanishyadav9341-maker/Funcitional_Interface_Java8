package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class DivisibleCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isDivisible = num -> num%5 == 0;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("DivisibleCheck by 5:- " +isDivisible.test(num));


    }
}
