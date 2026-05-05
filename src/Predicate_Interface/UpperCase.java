package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class UpperCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<String> isUpperCase = str -> str != null && str.equals(str.toUpperCase());

        System.out.print("Enter your Character:- ");
        String str = scan.nextLine();


        System.out.println("UpperCase:- " +isUpperCase.test(str));

    }
}
