package Predicate_PracticeSet;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckVowel {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            final Predicate<Character> isVowel = (ch) -> ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
                    ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o' || ch == 'u';

            System.out.print("Enter Character:- ");
            char ch = scan.next().charAt(0);

            System.out.println("Check Vowel:- " +isVowel.test(ch));
        }
    }
}
