package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class AgeCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isAge = age -> (age >= 0 && age < 120);

        System.out.print("Enter your Age:- ");
        int age = scan.nextInt();

        System.out.println("Age is Valid:- " +isAge.test(age));

    }
}
