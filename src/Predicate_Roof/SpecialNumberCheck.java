package Predicate_Roof;

import java.util.Scanner;
import java.util.function.Predicate;

public class SpecialNumberCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // Prime number check
        Predicate<Integer> isPrime = num -> {
            if (num <= 1)
                return false;
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        };




        // Perfect Square

        Predicate<Integer> isSquare = num -> Math.sqrt(num)%1 == 0;

        // Palindrome
        Predicate<Integer> isPalindrome = num -> {
            int rev = 0;
           int temp = num;
            while(temp != 0){
                int digit = temp%10;
                rev = rev*10+digit;
               temp = temp/10;
            }
             return rev == num;
        };

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("-----------------=:Result:=-----------------");
        System.out.println("Is Prime check:- " +isPrime.test(num));
        System.out.println("Is Perfect Square:- " +isSquare.test(num));
        System.out.println("Is Palindrome check:- " +isPalindrome.test(num));

    }
}
