package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class Odd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isOdd = num -> num%2 != 0;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Odd number:- " +isOdd.test(num));

    }
}
