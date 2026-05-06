package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class End {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<String> isEnd = str -> str != null && str.endsWith("Z");

        System.out.print("Enter Your Letter:- ");
        String str = scan.nextLine();

        System.out.println("Is End Letter Z is:- " +isEnd.test(str));

    }
}
