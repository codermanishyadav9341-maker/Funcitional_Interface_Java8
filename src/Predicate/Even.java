package Predicate;

import java.util.Scanner;
import java.util.function.Predicate;



@FunctionalInterface
public interface Even {
    boolean even(int num);
}

class Result1 implements Even{
    Scanner scan = new Scanner(System.in);

//    Using Predicate for even number
    Predicate<Integer> isEven = num -> num%2 == 0;

//     Using predicate for Positive number;

    Predicate<Integer> isPositive = num -> num>0;

//    FunctionalInterface Method Override
    public boolean even(int num){
        return isEven.test(num);
    }

//    Ya mthod input le raha hai;
    public void check(){
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Even number is:- " +even(num));
        System.out.println("Positive number is :- " +isPositive.test(num));
        System.out.println("Positive number and Even number is:- " +isEven.and(isPositive).test(num));

    }

    public static void main(String[] args){
        Result1 rr = new Result1();
        rr.check();
    }

}
