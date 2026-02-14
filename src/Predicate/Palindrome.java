package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface Palindrome {
    boolean isPalindrome(int num);
}

class Result16 implements Palindrome{
    Scanner scan = new Scanner(System.in);

    Predicate<Integer> isPalindrome = num ->{
        int original = num;
        int reverse = 0;

        while(num != 0){
            int digits = num%10;
            reverse = reverse*10+digits;
            num = num/10;
        }
        return original == reverse;
    };

    public boolean isPalindrome(int  num){
        return isPalindrome.test(num);
    }

    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Palindrome is:- " +isPalindrome(num));
    }

    public static void main(String[] args){
        Result16 rr = new Result16();
        rr.check();

    }
}