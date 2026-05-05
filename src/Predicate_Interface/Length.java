package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Length {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<String> isLength = str -> str != null && str.length() == 10;

        System.out.print("Enter your Characters:- ");
        String str = scan.nextLine();

        System.out.println("Letter Length == 10 is:- " +isLength.test(str));

    }
}
