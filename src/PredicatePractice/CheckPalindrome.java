package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckPalindrome {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isPalindrome = (str) -> {
                String reverse = new StringBuilder(str).reverse().toString();
                return reverse.equals(str);
            };

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Chek palindrome:- " +isPalindrome.test(str));
        }
    }
}









