package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class LowerCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<String> isLower = str -> str != null && str.equals(str.toLowerCase());

        System.out.print("Enter your Letter:- ");
        String str = scan.nextLine();


        System.out.println("LowerCase:- " +isLower.test(str));

    }
}
