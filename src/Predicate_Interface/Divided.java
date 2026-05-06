package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Divided {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isDivided = num -> num%2 != 0;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Is not Divisible by 2:- " +isDivided.test(num));

        scan.close();
    }
}
