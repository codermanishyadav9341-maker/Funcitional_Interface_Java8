package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class ZeroCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isZero = num -> num == 0;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Is Zero:- " +isZero.test(num));

        scan.close();
    }
}
