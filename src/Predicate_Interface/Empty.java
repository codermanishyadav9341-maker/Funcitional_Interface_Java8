package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Empty {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<String> isEmpty = str -> str.isEmpty();

        System.out.print("Enter your Characters:- ");
        String str = scan.nextLine();

        System.out.println("Is Empty:- " +isEmpty.test(str)) ;

    }
}
