package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class Greater {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isGreater = num -> num >= 100;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Is GreaterThan 100:- " +isGreater.test(num));

        scan.close();

    }
}
