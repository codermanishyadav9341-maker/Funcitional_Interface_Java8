package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class Digit {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<String> isDigit = str -> str.matches("\\d+");

        System.out.print("Enter your Characters:- ");
        String str = scan.next();

        System.out.println("Is String digits is:- " +isDigit.test(str));

    }
}
