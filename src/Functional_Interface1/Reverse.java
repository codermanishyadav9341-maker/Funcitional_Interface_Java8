package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Reverse {
    int reverse(int num);
}

class Result34 implements Reverse{

    @Override
    public int reverse(int num){
        int rev = 0;
        while(num != 0){
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;
        }
        return rev;
    }

    public static void main(String[] args){
        Reverse rr = new Result34();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Reverse number:- " +rr.reverse(num));

    }
}