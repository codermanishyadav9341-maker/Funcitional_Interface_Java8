package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Voting {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isAge = age -> age >= 18;

        System.out.print("Enter Your AgeCheck:- ");
        int age = scan.nextInt();

        System.out.println("Eligible for voting:- " +isAge.test(age));

    }
}
