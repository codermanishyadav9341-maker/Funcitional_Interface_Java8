package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class Check {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<String> isLetter = str -> str != null && str.contains("Java");

        System.out.print("Enter your Character:- ");
        String str = scan.nextLine();

        System.out.println("Letter Java is:- " +isLetter.test(str));


    }
}
