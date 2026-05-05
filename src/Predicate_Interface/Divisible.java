package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Divisible {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isDivisible = num -> num%3 == 0;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Is Divisible by 3:- " +isDivisible.test(num));


        scan.close();

    }
}
