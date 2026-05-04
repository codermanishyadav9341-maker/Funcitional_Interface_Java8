package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Palindrome {
    boolean check(int num);
}

class Result55 implements Palindrome{

    @Override
    public boolean check(int num){
        int rev = 0;
        int temp = num;

        while(num != 0){
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
         return temp == rev;
    }

    public static void main(String[] args){
        Palindrome pp = new Result55();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Palindrome check:- " +pp.check(num));

    }
}