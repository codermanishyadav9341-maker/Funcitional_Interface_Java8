package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class Vowel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Character> isVowel = ch ->

                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' ||
                        ch == 'i' || ch == 'o' || ch == 'u';



        System.out.print("Enter your Characters:- ");
        char ch = scan.next().charAt(0);

        System.out.println("Is check Vowel is:- " +isVowel.test(ch));


    }
}
