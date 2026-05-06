package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class Digits {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Character> isDigit = ch ->
                ch == '0' || ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6'
                || ch == '7' || ch == '8'  || ch == '9';


        System.out.print("Enter your Characters:- ");
        char ch = scan.next().charAt(0);

        System.out.println("Is Digits Check is:- " +isDigit.test(ch)) ;

    }
}
